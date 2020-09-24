package com.berlin83.chap01;

import java.util.Scanner;

/*
 * 직각 이등변 삼각형 출력
 * 이중 루프를 응용하면 기호를 늘어놓아 삼각형이나 사각형 모양으로 출력할 수 있습니다.
 * 실습 1-8은 왼쪽 아래가 직각인 이등변 삼각형을 출력하는 프로그램 입니다.
 */

public class Ex1_8TriangleLB {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		
		do {
			
			System.out.print("몇 단 삼각형 입니까? : ");
			n=stdIn.nextInt();
		}while (n <= 0);

		for(int i =1; i <=n; i++) {
			for(int j=1;j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
