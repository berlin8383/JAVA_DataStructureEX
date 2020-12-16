package chap02;
/*
 * �迭�� ����(Ŭ��)
 * �迭�� ������ �Ʒ�ó�� clone �޼��带 ȣ���Ͽ� ���� ����� �ֽ��ϴ�.
 * �迭�̸�.clone() 
 * �� ������ �迭�� �����ϰ� ������ �迭�� ���� ������ �����մϴ�. �ǽ� 2-3�� �迭�� ���� �ϴ� ���α׷��Դϴ�.
 */

public class Ex2_3_CloneArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = a.clone(); // b�� a�� ������ ����

		b[3] = 0; // �� ��ҿ��� 0�� ����

		System.out.print("a = ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		

		System.out.print("\nb = ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(" " + b[i]);

		}

	}

}
