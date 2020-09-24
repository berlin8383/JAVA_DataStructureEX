/*
 * 두 배열의 비교
 * 이제 하나의 배열이 아니라 여러 배열을 처리하는 알고리즘을 살펴보겠습니다.
 * 실습 2-7은 두 배열의"모든 요소의 값이 같은가"를 판단하는 메서드를 구현한 프로그램입니다.
 */
package com.berlin83.chap02;

import java.util.Scanner;

//두 배열이 같은가를 판단

public class Ex2_7_ArrayEqual {

	//두배열 a,b의 모든 요소가 같은가?
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}
		for(int i =0; i <a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열a의 요솟수 : ");
		int na = stdIn.nextInt();			//배열 a의 요솟수
		
		int [] a = new int[na];				//요솟수가 na인 배열
		
		for(int i = 0; i <na ; i++) {
			System.out.print("a["+i+"] : ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("배열 b의 요솟수 : ");
		int nb = stdIn.nextInt();			//배열b의 요솟수
		
		int[] b = new int[nb];				//요솟수가 nb인 배열
		
		for(int i =0; i < nb; i++) {
			System.out.print("b["+i+"] : ");
			b[i] = stdIn.nextInt();
		}
		System.out.println("배열 a 와 b 는" + (equals(a, b) ? "같습니다." : "같지 않습니다."));
	}
}
