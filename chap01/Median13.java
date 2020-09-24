package com.berlin83.chap01;

/*
 * 연습문제 Q4 세 값의 대소 관계 13종류의 모든 조합에 대해 중앙값을 구하여 출력하는 프로그램을 작성하세요
 * 실습 1-2와 실습 1C-1을 참고하세요
 */

public class Median13 {

	static int median(int a, int b, int c) {

		if (a >= b)
			if (b >= c)
				return b; // ABFG
			else if (a <= c)
				return a; // DEH
			else
				return c; // C
		else if (a > c)
			return a;// I
		else if (b > c)
			return c; // JK
		else
			return b;// LM
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("medien(3,2,1)" + median(3, 2, 1));
		System.out.println("medien(3,2,2)" + median(3,2,2));
		System.out.println("medien(3,1,2)" + median(3,1,2));
		System.out.println("medien(3,2,3)" + median(3,2,3));
		System.out.println("medien(2,1,3)" + median(2,1,3));
		System.out.println("medien(3,3,2)" + median(3,3,2));
		System.out.println("medien(3,2,3)" + median(3,2,3));
		System.out.println("medien(2,3,3)" + median(2,3,3));
		System.out.println("medien(2,3,1)" + median(2,3,1));
		System.out.println("medien(2,3,2)" + median(2,3,2));
		System.out.println("medien(1,3,2)" + median(1,3,2));
		System.out.println("medien(2,2,3)" + median(2,2,3));
		System.out.println("medien(1,2,3)" + median(1,2,3));
	}

}
