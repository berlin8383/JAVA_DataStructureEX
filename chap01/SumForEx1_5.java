package com.berlin83.chap01;

import java.util.Scanner;

public class SumForEx1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		
		for(int i =1; i <=n; i++) {
			sum += i;
		}
		
		System.out.println("1부터 "+n+"까지의 합은 " +sum+"입니다.");
	}

}
