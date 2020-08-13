package com.yedam.oper;

public class IncreaseOperatorExample {
	public static void main(String[] args) {
		boolean run = false;
		int var1 = 0;
		
		var1++; // var1 = var1 + 1;이라는 뜻 //// var1 = 1
		
		for(int i = 0; i<3; i++) {
			run = !run; // run = false 인데, false의 반대값은 true이다.
						////run = true
		if (run) {
			var1++;	// 1:ok , 3:ok, 2번째는 건너뜀 
			
		}
		System.out.println(var1);
		}
		
	}
}


//i=0 , run = true, var1 = 2
//i=1 , run = false , var1 = x
//i=2 , run = true, var1 = 3
