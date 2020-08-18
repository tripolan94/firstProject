package com.yedam.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class EmpDAO {
	
//수정	
	public void updateEmp(Employee emp) {
		Connection conn = DBConnection.getConnection();
		String sql = "UPDATE emp_temp SET salary = " + emp.getSalary() + "WHERE employee_id = " + emp.getEmployeeId();
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + "수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void removeEmp(Employee emp) {
		Connection conn = DBConnection.getConnection();
		String sql = "delete from emp_temp where employee_id = " + emp.getEmployeeId();
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + "삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
//입력
	public void addEmployee(Employee emp) {
		Connection conn = DBConnection.getConnection();
//db문장
//insert into emp_temp(employee_id, last_name, email, hire_date, job_id)
//values(301, 'test', 'test', '2020-05-05', 'IT_PROG');

		String sql = "insert into emp_temp(employee_id, last_name, email, hire_date, job_id)" + "values("
				+ emp.getEmployeeId() 
				+ ",\'" + emp.getLastName() 
				+ "\',\'" + emp.getEmail() 
				+ "\',\'" + emp.getHireDate() 
				+ "\',\'" + emp.getJobID() 
				+ "\')"; //역슬레쉬야!!!!
		System.out.println(sql);

		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

//조회

	public Employee[] getEmpList() {
		Connection conn = DBConnection.getConnection();
		Employee[] employees = new Employee[100];
		try {
			String sql = "select * from emp_temp";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			int idx = 0;
			while (rs.next()) {
				Employee emp = new Employee();
				String firstName = rs.getString("first_name");
				// 위아래 표현 방식은 똑같다.
				emp.setFirstName(firstName);
				emp.setLastName(rs.getString("last_name"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobID(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));

				employees[idx++] = emp;
			}
			System.out.println(" -- end of data -- ");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;
	} // end of getEmpList()


	

	/*
	 * public static void main(String[] args) { // DBConnection dbCon = new
	 * DBConnection(); Connection conn = DBConnection.getConnection();
	 * 
	 * try { String sql = "select * from emp_temp"; PreparedStatement pstmt =
	 * conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery(); while
	 * (rs.next()) { System.out.println( rs.getString("first_name") + ", " +
	 * rs.getString("last_name") + ", " + rs.getString("email") + ", " +
	 * rs.getString("salary") ); } System.out.println(" -- end of data -- ");
	 * 
	 * } catch (SQLException e) { e.printStackTrace(); } }
	 * System.out.println("프로그램 종료.");
	 */
}
