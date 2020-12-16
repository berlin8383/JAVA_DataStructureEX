package chap04;
//int�� ������ ��� ��

import java.util.Scanner;

public class Ex4_2_IntStackTester {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Ex4_1E_IntStack s = new Ex4_1E_IntStack(64);
		
		while(true) {
			System.out.println("���� ������ �� : " + s.size() + "/"
											  + s.capacity());
			System.out.print("(1)Ǫ��	(2)��	(3)��ũ"+
							 "(4)����	(0)���� : ");
			
			int menu = stdIn.nextInt();
			if(menu == 0) break;
			
			int x;
			switch (menu) {
			case 1:	//Ǫ��
				System.out.print("������ : ");
				x = stdIn.nextInt();
				try {
					s.push(x);
				}catch (Ex4_1E_IntStack.OverflowItStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;
				
			case 2:	//��
				try {
					x=s.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
				} catch (Ex4_1E_IntStack.OverflowItStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;
			case 3:	//��ũ
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� "+x+"�Դϴ�.");
				} catch (Ex4_1E_IntStack.OverflowItStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;
				
			case 4:	//����
				s.dump();
				break;
				
			}
		}
		stdIn.close();
	}
}
