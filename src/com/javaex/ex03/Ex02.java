package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수:");
		int point = sc.nextInt();
		
		if(point>=60) {
			//true 일때만 실행되는영역
			System.out.println("합격입니다.");
		}
		else {
			//false일때만 실해되는영역
			System.out.println("불합격입니다.");
		}
		
		
		sc.close();
		
	}
	
}
