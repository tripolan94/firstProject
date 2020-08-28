package com.yedam.test0827;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class NewExample4 {

	Member mem; // class 지정

	class Member { // class안에 class만들기(중첩클래스)
		String id;

		Member(String id) {
			this.id = id;
		}

		@Override // equals 재정의
		public boolean equals(Object obj) {
//			return super.equals(obj); //원래정의
			if (obj instanceof Member) { //새정의
				Member mem = (Member) obj; //obj캐스팅 
				return id.equals(mem.id);
			} else {
				return false;
			}
		}

		@Override
		public int hashCode() {
//			return super.hashCode();
			return Objects.hash(id);
		}

		public static int hashCode(Object[] a) { //코드값
			if (a == null) 
				return 0;
			int result = 1;
			for(Object element : a)
				result = 31 * result + (element == null ? 0 : element.hashCode())
				return result;
		}
		

	}

	public void printMember() { // static이 없으면
		Member m1 = new Member("hong"); // NewExample4지정 없이 사용 가능
	}

	public static void main(String[] args) {
//		Member m1 = new Member("hong"); //이거 안됨
		NewExample4 ne = new NewExample4();
		Member m1 = ne.new Member("hong"); // 이렇게 지정해줘야 함.
		Member m2 = ne.new Member("hong");

		System.out.println(m1 == m2); // false
		System.out.println(m1.equals(m2)); // false
		
		Objects.hash(1);
		System.out.println(Objects.hash("hhh"));
//		System.out.println(hashCode(new Integer(1)));
		
		Set<Member> set = new HashSet<>();
		set.add(m1);
		set.add(m2);
		for(Member m : set) {
			System.out.println(m.id);
		}
	}
}
