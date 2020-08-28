package com.yedam.test0827;


//java.lang.Math 평소에 쓰는 패키지의 매스 풀네임

//com.yedam.test.Math 가 아래 매스의 실 주소값
class Math{
	public int max (int a, int b) { //매개값중 큰 값을 리턴해줌
		int result = (a>=b) ? a:b;
		return result;
	}
}

class Math2{
	public static int max (int a, int b) { 
		//static 이 있으면 max도 실행가능하게 메모리에 들어간다.
		int result = (a>=b) ? a:b;
		return result;
	}
	public static int min (int a, int b) {
		return (a<b) ? a:b;
	} // return만 써줘도 된다.
	
	public static double mindouble (double a, double b) {
		return (a<b) ? a:b;
	}
}

public class NewExample2 {
	public static void main(String[] args) {
		Math math = new Math();
		int result = math.max(10, 5);
		
		int result2 = Math2.max(10, 5); // static이 있는 생성자 값은 인스턴스를 안해도 들어간다.

		System.out.println("큰수는 :" + result2);
		
		int result3 = Math2.min(10, 5);
		System.out.println("작은수는 :" + result3);
		
		double result4 = Math2.mindouble(24.6, 3.8);
		System.out.println("작은수는 :" + result4);

	}
}
