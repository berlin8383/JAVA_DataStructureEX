package com.berlin83.chap01;

import java.util.Scanner;

/*
 * 구조적 프로그래밍
 * 하나의 입구와 하나의 출구를 가진 구성 요소만을 계층적으로 배치하여 프로그램을 구성하는 방법을 
 * 구조적 프로그래밍(structured programming)이라고 합니다.
 * 구조적 프로그래밍은 순차,선택,반복이라는 3종류의 제어 프름을 사용합니다.
 * 
 * 2자리의 양수 (10~99)를 입력합니다.
 */

public class Ex1_7Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner stdIn = new Scanner(System.in);
		int no;
		
		System.out.println("2자리의 정수를 입력하세요");
		
		do {
			System.out.print("입력 : ");
			no = stdIn.nextInt();
			
		}while (no < 10 || no >99);
		
		System.out.println("변수 no의 값은 " + no + "가(이) 되었습니다.");

	}

}
