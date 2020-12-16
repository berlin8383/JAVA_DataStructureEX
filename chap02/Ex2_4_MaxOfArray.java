package chap02;

import java.util.Scanner;

/*
 * �迭 ����� �ִ��� ���ϴ� �޼ҵ�
 * �迭 ����� �ִ��� ���ϴ� ���α׷��� �Ʒ� �ǽ��� ���� ���캸�ڽ��ϴ�. �� ���α׷��� �� �迭 height�� ��Ұ� ��Ÿ���� ���� �����
 * "Ű"�Դϴ�. �迭�� ��Ҹ� ���ϴ� ������ ������ �޼��� maxOf�� �����ϰ� �ֽ��ϴ�. �� �޼���� �μ��� ���� �迭 a�� �ִ��� ���ϰ�
 * �� ���� ��ȯ �մϴ�.
 */

public class Ex2_4_MaxOfArray {
	//�迭 a�� �ִ��� ���Ͽ� ��ȯ�մϴ�.
	static int maxOf(int[] a) {
		int max = a[0] ;
		for (int i =1;i < a.length; i++) {
			if(a[i]>max) {max = a[i];}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		System.out.print("��� �� : ");
		int num = scanner.nextInt(); //�迭�� ��ڼ��� �Է� ����
		
		int[] height = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("height["+i+"] : ");
			height[i] = scanner.nextInt();
		}
		
		System.out.println("�ִ��� "+maxOf(height)+"�Դϴ�.");

	}

}
