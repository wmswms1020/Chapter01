package com.javaex.ex01;

public class Ex10 {

	public static void main(String[] args ) {
		
		//논리연산자
		int a = 5;
		int b = 7;
		
		//논리 연산자 기본 &&
		System.out.println("&& 연산자");
		System.out.println( true && true );		//true
		System.out.println( true && false );	//false
		System.out.println( false && true );	//false
		System.out.println( false && false );	//false
		
		//논리 연산자 기본 ||
		
		
		
		
		// 논리 연산자 응용
		System.out.println( (a>b)&&(a<b) );		// F T --> F
		System.out.println( (a>b)&&(a>b) );		// F F --> F
		System.out.println("-----------------");
		
		System.out.println( (a>b)||(a<b) );		// F T --> T
		
		//논리 연산자 기본 !
		System.out.println("-----------------");
		System.out.println(a>b);		// 5>7 -->F
		System.out.println( !(a>b) );	// !F --> T
		
		System.out.println(a<b);		//	5<7 -->T
		System.out.println( !(a<b) );	//	!T -->F
		
		
		
		
	}
	
}
