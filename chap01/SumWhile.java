package com.berlin83.chap01;
/*
 * 1부터 n까지의 정수 합 구하기
 */

import java.util.Scanner;

public class SumWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = 0; //합
		int i =1;
		
		while(i<=n) { //i가 n이하면 반복합니다.
			sum +=i;	//sum에 i를 더합니다.
			i++;		//i값을 1만큼 증가시킵니다.
		}
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
		
		stdIn.close();
	}

}
