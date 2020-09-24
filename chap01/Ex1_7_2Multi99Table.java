package com.berlin83.chap01;
/*
 * 다중 루프 
 * 지금까지 다룬 프로그램은 단순한 반복을 수행했습니다. 하지만 반복 안에서 다시 반복할 수도 
 * 있습니다. 이런 반복을 루프가 중첩되는 수준에 따라 '이중 루프, 삼중 루프'라고 합니다.
 * 
 * 곰셈표
 * 실습 1-7은 이중 루프를 사용하는 알고리즘의 예로 곱셈표를 출력하는 프로그램입니다.
 */

public class Ex1_7_2Multi99Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------곱셈표-----");
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%3d",i*j);
			}
			System.out.println();
		}

	}

}
