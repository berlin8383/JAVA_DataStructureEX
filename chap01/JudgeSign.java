package com.berlin83.chap01;

import java.util.Scanner;

/*
 * 조건 판단과 분기
 * 실습 1-3은 입력한 정숫값의 부호(양수/음수/0)를 판단하여 출력하는 프로그램입니다. 
 */

public class JudgeSign {
	
	//입력한 정숫값이 양수인지 음수인지 0인지 판단합니다.
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int n = stdIn.nextInt();
		
		if(n>0)
			System.out.println("이 수는 양수 입니다.");
		else if (n<0)
			System.out.println("이 수는 음수 입니다.");
		else
			System.out.println("이 수는 0입니다.");
		stdIn.close();

	}

}
