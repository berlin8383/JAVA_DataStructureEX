package chap01;

import java.util.Scanner;

public class Median {
	
	static int med3(int a, int b, int c) {
		
		if(a>=b)
			if(b >=c)
				return b; //ABFG
			else if(a <=c)
				return a; //DEH
			else
				return c; //C
		else if(a>c)
			return a;//I
		else if (b>c)
			return c; //JK
		else	
		return b;//LM
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ������ �߾Ӱ��� ���մϴ�.");
		System.out.println("a�� �� : ");
		int a = stdIn.nextInt();
		System.out.println("b�� �� : ");
		int b = stdIn.nextInt();
		System.out.println("c�� �� : ");
		int c = stdIn.nextInt();
		
		System.out.println("�߾Ӱ���" +med3(a,b,c)+"�Դϴ�.");

		stdIn.close();
	}

}
