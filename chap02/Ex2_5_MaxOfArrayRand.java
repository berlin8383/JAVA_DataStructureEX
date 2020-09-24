package com.berlin83.chap02;

import java.util.Random;
import java.util.Scanner;

/*
 * 난수 사용해 배열의 요솟값 설정하기
 * 배열의 요소에 값을 하나씩 입력하는 것이 귀찮을 경우 각 요소에 난수를 대입하면 됩니다.
 */

//배열 요소의 최댓값을 나타냅니다.(값을 난수로 생성)


public class Ex2_5_MaxOfArrayRand {
	
	//배열 a의 최댓값을 구하여 반환합니다.
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i <a.length; i++) {
			if(a[i]>max) {
				max = a[i]; 
				}
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		
		int num = stdIn.nextInt();				//배열의 요솟수를 입력 받음
		
		int[] height = new int[num];			//요솟수가 num인 배열을 생성
		
		System.out.println("키 값은 아래와 같습니다.");
		for(int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);	//요소의 값을 난수로 결정(0부터 89까지의 난수가 생성)
			System.out.println("height[" + i + "] :" + height[i]);
		}
		
		System.out.println("최댓값은 " + maxOf(height)+"입니다.");

	}

}
