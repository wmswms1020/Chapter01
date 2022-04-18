package com.javaex.ex04;

public class Ex07 {

	public static void main(String[] args) {
		//y축 세로 이동
		for(int y=1; y<=6; y++) {
			
			//x축 가로 이동
			for(int x =1; x<=y; x++) {
				System.out.print("*");
			}
			
			
			//가로 이동반복 끝나면 줄바꿈
			System.out.println("");
		}

	}

}
