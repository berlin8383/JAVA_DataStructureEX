package chap01;

import java.util.Scanner;

/*
 * ���� �̵ �ﰢ�� ���
 * ���� ������ �����ϸ� ��ȣ�� �þ���� �ﰢ���̳� �簢�� ������� ����� �� �ֽ��ϴ�.
 * �ǽ� 1-8�� ���� �Ʒ��� ������ �̵ �ﰢ���� ����ϴ� ���α׷� �Դϴ�.
 */

public class Ex1_8TriangleLB {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");
		
		do {
			
			System.out.print("�� �� �ﰢ�� �Դϱ�? : ");
			n=stdIn.nextInt();
		}while (n <= 0);

		for(int i =1; i <=n; i++) {
			for(int j=1;j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
