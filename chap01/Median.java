package com.berlin83.chap01;

import java.util.Scanner;

public class Median {
	
	static int med3(int a, int b, int c) {
		
		if(a>=b)
			if(b >=c)
				return b; //ABFG
			else if(a <=c)
				return a; //DEH
			else
				return c; //C
		else if(a>c)
			return a;//I
		else if (b>c)
			return c; //JK
		else	
		return b;//LM
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.println("a의 값 : ");
		int a = stdIn.nextInt();
		System.out.println("b의 값 : ");
		int b = stdIn.nextInt();
		System.out.println("c의 값 : ");
		int c = stdIn.nextInt();
		
		System.out.println("중앙값은" +med3(a,b,c)+"입니다.");

		stdIn.close();
	}

}
