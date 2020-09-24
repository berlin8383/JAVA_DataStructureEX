package com.berlin83.chap04;
//int형 스택의 사용 예

import java.util.Scanner;

public class Ex4_2_IntStackTester {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Ex4_1E_IntStack s = new Ex4_1E_IntStack(64);
		
		while(true) {
			System.out.println("현재 데이터 수 : " + s.size() + "/"
											  + s.capacity());
			System.out.print("(1)푸시	(2)팝	(3)피크"+
							 "(4)덤프	(0)종료 : ");
			
			int menu = stdIn.nextInt();
			if(menu == 0) break;
			
			int x;
			switch (menu) {
			case 1:	//푸시
				System.out.print("데이터 : ");
				x = stdIn.nextInt();
				try {
					s.push(x);
				}catch (Ex4_1E_IntStack.OverflowItStackException e) {
					// TODO: handle exception
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
				
			case 2:	//팝
				try {
					x=s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch (Ex4_1E_IntStack.OverflowItStackException e) {
					// TODO: handle exception
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			case 3:	//피크
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 "+x+"입니다.");
				} catch (Ex4_1E_IntStack.OverflowItStackException e) {
					// TODO: handle exception
					System.out.println("스택이 비어 있습니다.");
				}
				break;
				
			case 4:	//덤프
				s.dump();
				break;
				
			}
		}
	}
}
