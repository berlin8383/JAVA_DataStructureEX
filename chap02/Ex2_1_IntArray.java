package com.berlin83.chap02;
/*
 * 실습 2-1의 프로그램에서 배열의 특성을 확인해 보겠습니다.
 * 구성 요소의 자료형이 int 형인 배열(구성 요솟수는 5 : new에 의해 본체를 생성)
 * 배열은 0번째 부터 생성됨
 */

public class Ex2_1_IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[5];//배열의 선언
		
		a[1] = 37; //a[1]에 37을 대입
		a[2] = 51; //a[2]에 51을 대입
		a[4] = a[1] * 2; //a[4]에 a[1]*2, 곧 74를 대입
		
		for(int i =0; i <a.length; i++) {
			System.out.println("a["+i+"] = "+ a[i]);
		}

	}

}
