package com.yedam.cond;
//p 126 
import java.io.IOException;

public class WhileExample2 {
	public static void main(String[] args) throws IOException {
		
		boolean run = true;
		int num = 10;
		int keyCode = 0;
		while(run) {		
			System.out.println("키를 누르세요.");
			keyCode = System.in.read(); 
			if(keyCode != 13 && keyCode!= 10) {
			System.out.println(keyCode);
			}
			System.in.read();
			System.in.read();

			//System.in.read();에서 빨간줄 뜨면 첫번째클릭하면 IOException추가됨
			if (keyCode == 57) {
				run = false;
			}
			
//			System.out.println("num: " + num);
//			if(num-- == 0)
//				run = false; // = break;
			
		}
		System.out.println("프로그램 종료.");
	}
}
