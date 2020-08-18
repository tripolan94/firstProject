package com.yedam.database;

import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.리스트 2.입력 3.수정 4.삭제 9.종료");
			System.out.println("---------------------------");
			System.out.print("선택 > ");
			int selectNo = scn.nextInt();
			if(selectNo == 1) {
				EmpDAO dao = new EmpDAO();
				Employee[] emps = dao.getEmpList();
				for (Employee emp : emps) {
					if (emp != null) {
						System.out.println(emp.toString());
					}
				}
			} else if (selectNo == 2) {
//				EmpDAO dao = new EmpDAO();
//				Employee emp = new Employee(333, "test", "test", "2020-05-05", "IT_PROG");
//				dao.addEmployee(emp);
				
				
				System.out.println("사원번호 입력 >");
				int empID = scn.nextInt(); scn.nextLine(); 
				System.out.println("이름 입력 >");
				String empName = scn.nextLine(); 
				System.out.println("e메일 입력 >");
				String empEmail = scn.nextLine();
				System.out.println("고용일 입력 >");
				String empHireDate = scn.nextLine();
				System.out.println("일아이디 입력 >");
				String empJobId = scn.nextLine();
				
				EmpDAO dao = new EmpDAO();
				Employee emp = new Employee(empID, empName, empEmail, empHireDate, empJobId);
				dao.addEmployee(emp);
				
			} else if (selectNo == 3) {
				EmpDAO dao = new EmpDAO();
				Employee emp = new Employee();
				
				System.out.println("사원번호 입력 >");
				int empID = scn.nextInt(); scn.nextLine(); 
				emp.setEmployeeId(empID);
				
				System.out.println("수정할 월급내용 >");
				int salary = scn.nextInt();
				emp.setSalary(salary);			
				
				dao.updateEmp(emp);
				
			} else if (selectNo == 4) {
				System.out.print("삭제할 사원번호 입력 > ");
				int delId = scn.nextInt();
				EmpDAO dao = new EmpDAO();
				Employee emp = new Employee();
				emp.setEmployeeId(delId);
				dao.removeEmp(emp);
				
				
			} else if (selectNo == 9) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
