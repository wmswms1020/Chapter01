package com.javaex.ex04;

public class Ex06 {

	public static void main(String[] args) {
		
		//y축 세로반복
		for(int y=1; y<=6; y++) {
			
			//x축 가로반복
			for(int x =1; x<=6; x++) {
				System.out.print("*");
			}
			
			
			//가로 반복이 끝나면 줄바꿈
			System.out.println("");
		}
				
		
	}

}
