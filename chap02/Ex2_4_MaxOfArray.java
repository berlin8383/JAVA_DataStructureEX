package com.berlin83.chap02;

import java.util.Scanner;

/*
 * 배열 요소의 최댓값을 구하는 메소드
 * 배열 요소의 최댓값을 구하는 프로그램을 아래 실습을 통해 살펴보겠습니다. 이 프로그램에 서 배열 height의 요소가 나타내는 것은 사람의
 * "키"입니다. 배열의 요소를 구하는 절차는 별도의 메서드 maxOf로 구현하고 있습니다. 이 메서드는 인수로 받은 배열 a의 최댓값을 구하고
 * 그 값을 반환 합니다.
 */

public class Ex2_4_MaxOfArray {
	//배열 a의 최댓값을 구하여 반환합니다.
	static int maxOf(int[] a) {
		int max = a[0] ;
		for (int i =1;i < a.length; i++) {
			if(a[i]>max) {max = a[i];}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = scanner.nextInt(); //배열의 요솟수를 입력 받음
		
		int[] height = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("height["+i+"] : ");
			height[i] = scanner.nextInt();
		}
		
		System.out.println("최댓값은 "+maxOf(height)+"입니다.");

	}

}
