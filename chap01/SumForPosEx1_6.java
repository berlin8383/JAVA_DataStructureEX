package com.berlin83.chap01;

import java.util.Scanner;

/*
 * 1,2,... ,n의 합을 구합니다.(양수만 입력).
 */

public class SumForPosEx1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.print("n의 값 : ");
			n=stdIn.nextInt();
			
		}while(n<=0);
		
		@SuppressWarnings("unused")
		int sum = 0;
		
		for(int i=1;i<=n;i++) {
			sum+=i;
		}

	}

}
