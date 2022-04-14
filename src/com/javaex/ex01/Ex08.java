package com.javaex.ex01;

public class Ex08 {

	public static void main(String[]args ) {
		
		//대입연산자
		
		int a = 7;
		int b = 2;
		
		System.out.println("산술연산자");
		//산술연산자
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		System.out.println(a/b); //정수 / 정수 정수몫만 나옴
		System.out.println(a%b); //정수를 나누고 나머지값나옴
		
		//산술연산자 / % 자세히
		System.out.println("산술연산자 / % 자세히");
		System.out.println("--------------");
		System.out.println(7/2);        //3
		System.out.println(7.0/2.0);	//3.5		
		System.out.println(7%2);		//1
		System.out.println(7.0%2.0);	//1.0
		System.out.println("--------------");
		
		//부호연산자
		int var = -3;
		int pvar = +var;
		int mvar = -var;
		
		System.out.println(pvar);
		System.out.println(mvar);
		
		//증가 감소 연산자
		
		System.out.println("증감연산자");
		System.out.println(a);		//7
		System.out.println(++a);	//8
		System.out.println(a);		//8
		
		System.out.println(b);		//2
		System.out.println(--b);	// 2-->1
		System.out.println(b);		//1
		
		System.out.println(a);		//8
		System.out.println(a++);	//8 출력하면 아직 자기한테만 보임
		System.out.println(a);		//9
		
		System.out.println(b);		//1
		System.out.println(b--);	//1 출력하면 아직 자기한테만 보임
		System.out.println(b);		//0
		
		
		
		
		
		
	}
	
}
