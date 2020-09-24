package com.berlin83.chap02;
/*
 * 배열의 요솟값을 초기화하며 배열 선언하기
 * 배열 본체는 배열 초기화(array initializer)를 사용하면 배열 본체의 생성과 동시에 각 요소의
 * 초기화가 가능합니다. 다음 프로그램을 통해 실습해 보겠습니다.
 * 구성 자료형이 int형인 배열(구성 요솟수는 5 : 배열 초기자에 의해 생성)
 */

public class Ex2_2_IntArrayInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5}; //배열 초기자에 의해 생성
		
		for(int i =0; i <a.length; i++)
			System.out.println("a["+i+"] = " +a[i]);

	}

}
