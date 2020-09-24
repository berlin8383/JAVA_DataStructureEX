/*
 * 기수 변환을 수행하는 프로그램
 * 기수의 의미
 * 기수는 수를 나타내는 데 기초가 되는 수로, 10진법에서는 0에서 9까지의 정수를 말합니다. 서수는 사물의 순서를 타나내는 수 입니다.
 * 기수는 일,이,삼 .... 이고, 서수는 첫째,둘째,셋째....라고 생각하면 됩니다.
 */
package com.berlin83.chap02;

import java.util.Scanner;

//입력받은 10진수를 2진수~36진수로 기수 변환하여 나타냄

public class Ex2_8_CardConvRev {
	//정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환합니다.
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;						//변환 후의 자릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r); //r로 나눈 나머지를 저장
			x /= r;
		}while (x != 0);
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int no;								//변환하는 정수
		int cd;								//기수
		int dno;							//변환 후의 자릿수
		int retry;							//다시 한 번?
		char[] cno = new char[32];			//변환 후 각 자리의 숫자를 넣어두는 문자의 배열
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수 : ");
				no = stdIn.nextInt();
			}while (no < 0);
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36) : ");
				cd = stdIn.nextInt();
			}while(cd<2||cd>36);
			
			dno = cardConvR(no, cd, cno);		//no를 cd진수로 변환
			
			System.out.print(cd + "진수로는 ");
			for(int i = dno -1; i>=0; i--) {	//윗자리부터 차례로 나타냄
				System.out.print(cno[i]);
			}
			System.out.println("입니다.");
			
			System.out.print("한 번 더 할까요? (1.예/0.아니오) : ");
			retry = stdIn.nextInt();
		}while(retry == 1);
	}

}
