package com.berlin83.chap01;

public class Med3 {

	static int med3(int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a > b && c < b) || (a < b && c > b))
			return b;
		return c;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("med3(3,2,1)" + med3(3, 2, 1));
		System.out.println("med3(3,2,2)" + med3(3, 2, 2));
		System.out.println("med3(3,1,2)" + med3(3, 1, 2));
		System.out.println("med3(3,2,3)" + med3(3, 2, 3));
		System.out.println("med3(2,1,3)" + med3(2, 1, 3));
		System.out.println("med3(3,3,2)" + med3(3, 3, 2));
		System.out.println("med3(3,2,3)" + med3(3, 2, 3));
		System.out.println("med3(2,3,3)" + med3(2, 3, 3));
		System.out.println("med3(2,3,1)" + med3(2, 3, 1));
		System.out.println("med3(2,3,2)" + med3(2, 3, 2));
		System.out.println("med3(1,3,2)" + med3(1, 3, 2));
		System.out.println("med3(2,2,3)" + med3(2, 2, 3));
		System.out.println("med3(1,2,3)" + med3(1, 2, 3));

	}

}