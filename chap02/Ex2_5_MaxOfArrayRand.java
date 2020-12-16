package chap02;

import java.util.Random;
import java.util.Scanner;

/*
 * ���� ����� �迭�� ��ڰ� �����ϱ�
 * �迭�� ��ҿ� ���� �ϳ��� �Է��ϴ� ���� ������ ��� �� ��ҿ� ������ �����ϸ� �˴ϴ�.
 */

//�迭 ����� �ִ��� ��Ÿ���ϴ�.(���� ������ ����)


public class Ex2_5_MaxOfArrayRand {
	
	//�迭 a�� �ִ��� ���Ͽ� ��ȯ�մϴ�.
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i <a.length; i++) {
			if(a[i]>max) {
				max = a[i]; 
				}
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		System.out.print("��� �� : ");
		
		int num = stdIn.nextInt();				//�迭�� ��ڼ��� �Է� ����
		
		int[] height = new int[num];			//��ڼ��� num�� �迭�� ����
		
		System.out.println("Ű ���� �Ʒ��� �����ϴ�.");
		for(int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);	//����� ���� ������ ����(0���� 89������ ������ ����)
			System.out.println("height[" + i + "] :" + height[i]);
		}
		
		System.out.println("�ִ��� " + maxOf(height)+"�Դϴ�.");

		stdIn.close();

	}

}
