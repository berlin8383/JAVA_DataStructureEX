package com.berlin83.chap05;

import java.util.Scanner;

import com.berlin83.chap04.Ex4_1E_IntStack;

/*
 * 재귀 알고리즘의 분석
 * 실습 5-3의 프로그램을 살펴보면 이 프로그램은 재귀 메서드인 recur메서드
 * 와 main메서드로 구성되어 있습니다. 짧은 코드로 구현한 recur메서드를 통
 * 해 재귀에 대해 좀 더 자세히 알아보겠습니다.
 */
public class Ex5_5_RecurX2 {
	//재귀 함수 이해하기
	
	//꼬리 재귀를 제거했습니다.
	static void recur(int n) {
		Ex4_1E_IntStack s = new Ex4_1E_IntStack(n);
		
		while(true) {
			
			if(n > 0) {
				s.push(n);					//n의 값을 푸시
				n = n-1;
				continue;
			}
			if(s.isEmpty() != true) { 		//스텍이 비어 있지 않다면
				n = s.pop();				//저장하고 있던 스택의 값을 팝
				System.out.println(n);
				n = n -2;
				continue;
			}
			break;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요");
		int x = stdIn.nextInt();
		
		recur(x);
	}
}
