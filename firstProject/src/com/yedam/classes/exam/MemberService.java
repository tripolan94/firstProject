package com.yedam.classes.exam;

public class MemberService {

	public boolean login(String id, String password, Member[] ms) {

		Member[] members = new Member[3];
		members[0] = new Member("홍길동", "hong");
		members[0].setPassword("hong123");
		members[1] = new Member("김유신", "hong");
		members[0].setPassword("kim123");
		members[2] = new Member("최재영", "hong");
		members[0].setPassword("choi123");

		boolean result = false;
		for (int i = 0; i < ms.length; i++) {
			if (id.equals(ms[i].getId()) && password.equals(ms[i].getPassword())) {
				result = true;
				break;
			} else
				result = false;
		}
		return result;
	}

	public void logout() {
		System.out.println("로그아웃되었습니다.");
	}
}
