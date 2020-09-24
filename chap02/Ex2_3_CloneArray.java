package com.berlin83.chap02;
/*
 * 배열의 복제(클론)
 * 배열의 복제는 아래처럼 clone 메서드를 호출하여 쉽게 만들수 있습니다.
 * 배열이름.clone() 
 * 이 수식은 배열을 복제하고 복제한 배열에 대한 참조를 생성합니다. 실습 2-3은 배열을 복제 하는 프로그램입니다.
 */

public class Ex2_3_CloneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = a.clone(); // b는 a의 복제를 참조

		b[3] = 0; // 한 요소에만 0을 대입

		System.out.print("a = ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		

		System.out.print("\nb = ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(" " + b[i]);

		}

	}

}
