package chap01;

/*
 * �������� Q4 �� ���� ��� ���� 13������ ��� ���տ� ���� �߾Ӱ��� ���Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���
 * �ǽ� 1-2�� �ǽ� 1C-1�� �����ϼ���
 */

public class Median13 {

	static int median(int a, int b, int c) {

		if (a >= b)
			if (b >= c)
				return b; // ABFG
			else if (a <= c)
				return a; // DEH
			else
				return c; // C
		else if (a > c)
			return a;// I
		else if (b > c)
			return c; // JK
		else
			return b;// LM
	}

	public static void main(String[] args) {
		
		System.out.println("medien(3,2,1)" + median(3, 2, 1));
		System.out.println("medien(3,2,2)" + median(3,2,2));
		System.out.println("medien(3,1,2)" + median(3,1,2));
		System.out.println("medien(3,2,3)" + median(3,2,3));
		System.out.println("medien(2,1,3)" + median(2,1,3));
		System.out.println("medien(3,3,2)" + median(3,3,2));
		System.out.println("medien(3,2,3)" + median(3,2,3));
		System.out.println("medien(2,3,3)" + median(2,3,3));
		System.out.println("medien(2,3,1)" + median(2,3,1));
		System.out.println("medien(2,3,2)" + median(2,3,2));
		System.out.println("medien(1,3,2)" + median(1,3,2));
		System.out.println("medien(2,2,3)" + median(2,2,3));
		System.out.println("medien(1,2,3)" + median(1,2,3));
	}

}
