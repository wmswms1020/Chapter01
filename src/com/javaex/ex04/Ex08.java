package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
	
		int i =1;
		
		while(true) {
			
			//조건이 되면 탈출
			if(i%6==0 && i%14==0) {
				//if문이 true 일때
				System.out.println(i);
				break; //이거 쓰면 else를 안써도됨
			}
			i++;
				
			
			
			
		}
	}

}
