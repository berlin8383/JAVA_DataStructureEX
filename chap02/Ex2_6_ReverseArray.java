/*
 * 두 값의 교환
 * 배열의 역순 정렬은 요소 교환이 총 n/2회 필요합니다.
 * 
 */
package com.berlin83.chap02;

import java.util.Scanner;

//배열 요소에 값을 읽어 들여 역순으로 정렬합니다.

public class Ex2_6_ReverseArray {
	//배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
	static void swap(int[] a,int idx1, int idx2 ) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {
		for (int i = 0; i < a.length /2 ; i++) {
			swap(a, i, a.length-i-1);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();			//요솟수
		
		int[] x = new int[num];
		int[] y = new int[num];
		
		for(int i =0; i < num; i++) {
			System.out.print("x["+i+"] :");
			x[i] = stdIn.nextInt();
		}
		
		y = x.clone();
//		y=x;
		
		reverse(x);
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i =0 ; i <num; i++) {
			System.out.print("y["+i+"] = "+y[i]+"   ");
			System.out.println("x["+i+"] = "+x[i]);
		}
	}

}
