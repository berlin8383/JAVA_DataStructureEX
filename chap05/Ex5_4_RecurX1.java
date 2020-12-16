package chap05;

import java.util.Scanner;

/*
 * 재귀 알고리즘의 분석
 * 실습 5-3의 프로그램을 살펴보면 이 프로그램은 재귀 메서드인 recur메서드
 * 와 main메서드로 구성되어 있습니다. 짧은 코드로 구현한 recur메서드를 통
 * 해 재귀에 대해 좀 더 자세히 알아보겠습니다.
 */
public class Ex5_4_RecurX1 {
	//재귀 함수 이해하기
	
	//꼬리 재귀를 제거했습니다.
	static void recur(int n) {
		while(n > 0) {
			recur(n-1);
			System.out.println(n);
			n = n -2;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요");
		int x = stdIn.nextInt();
		
		recur(x);
	}
}
