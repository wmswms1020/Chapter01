package com.javaex.ex02;

public class Ex01 {

	public static void main(String [] args) {
		
		int i = 2345;
		double d = 3.14;
		char c = '한';
		String s = "한";
		String str = "굿모닝";
		String name = "소준호";
		
		System.out.println("안녕하세요");
		System.out.println(str);
		
		
		System.out.println(str + str);
		System.out.println(str + i);
		String var01 = str+i;
		System.out.println(str + " 랑 " + i);
		
		System.out.println(str + d);
		
		
		System.out.println(c);
		System.out.println(c + c);
		
		System.out.println(s);
		System.out.println(s + s);
		
		
		System.out.println("제이름은 "+name+" 입니다.");
		
		System.out.println("--------------------------");
		
		
		System.out.println("안녕\\하\\세여");
		
		
		
	} 
	
	
}
