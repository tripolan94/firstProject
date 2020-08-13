package com.yedam.oper;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		// p91~93논리연산자
		int charCode = 'A'; // A = 65
		if (charCode >= 65 & charCode <= 90) {
			System.out.println("대문자입니다.");
		}

		int num1 = 10;
		int num2 = 20;
		if (num1++ < 10 && num2++ > 20) {
			System.out.println("참입니다.");
		}
		System.out.println(num1 + ", " + num2);
		// 값이 11, 20이 나오는데 &&두개를 쓰면 앞에 것만 연산으로 값을 구한다.
		// &한개 쓰면 양쪽 다 확인해서 값을 확인한다. = 11, 21
//p94비트논리연산자
		
		int a = 10, b = 11;
//		int result = a & b; // 값 10
		int result = a | b; // 값 11
		System.out.println("논리곱 결과 : " + result);

//p96 비트 이동 연산자
		result = a << 2; // a= 10(00001010)
						 // a(00001010)의 비트들을 왼쪽으로 2칸씩 이동하겠다는 것(->00101000)
		System.out.println("비트이동결과 : " + result);
		
		result = a >> 2; 
		System.out.println("비트이동결과 : " + result);
						// a(00001010)의 비트들을 오른쪽으로 2칸씩 이동하겠다는 것(->00000010)
						//맨오른쪽은 사라짐
		
		result = 30 << 3;
		System.out.println("비트이동결과 : " + result);

		
//p98 대입연산자
		result += 30; // result = result + 30
		
		result = 80; 
		boolean pass = false;
		if (result >= 80) {
			pass = true;
		} else {
			pass = false;
		}
		
		//위 아래 구문의 뜻은 같다.
//p100 삼항연산자
		pass = (result >= 80) ? true : false;
		
	}
}
