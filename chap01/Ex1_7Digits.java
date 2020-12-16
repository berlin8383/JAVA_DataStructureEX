package chap01;

import java.util.Scanner;

/*
 * ������ ���α׷���
 * �ϳ��� �Ա��� �ϳ��� �ⱸ�� ���� ���� ��Ҹ��� ���������� ��ġ�Ͽ� ���α׷��� �����ϴ� ����� 
 * ������ ���α׷���(structured programming)�̶�� �մϴ�.
 * ������ ���α׷����� ����,����,�ݺ��̶�� 3������ ���� ������ ����մϴ�.
 * 
 * 2�ڸ��� ��� (10~99)�� �Է��մϴ�.
 */

public class Ex1_7Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner stdIn = new Scanner(System.in);
		int no;
		
		System.out.println("2�ڸ��� ������ �Է��ϼ���");
		
		do {
			System.out.print("�Է� : ");
			no = stdIn.nextInt();
			
		}while (no < 10 || no >99);
		
		System.out.println("���� no�� ���� " + no + "��(��) �Ǿ����ϴ�.");

	}

}
