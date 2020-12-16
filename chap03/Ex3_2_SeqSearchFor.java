package chap03;

import java.util.Scanner;

/*
 * while���� for������ ������ ���α׷�
 */
class SeqSearchFor{
	//��ڼ���n�� �迭 a���� key�� ���� ��Ҹ� ���� �˻��մϴ�.
	static int seqSearch(int[] a,int n, int key) {
	
		for(int i = 0; i < n ; i++) {
			if(a[i]==key) {
				return i;				//�˻� ����(�ε��� ��ȯ)
			}
		}
		return -1;						//�˻� ����(-1�� ��ȯ)
		
	}
}
public class Ex3_2_SeqSearchFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];						//��ڼ��� num�� �迭
		
		for(int i = 0; i < num ; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("�˻��� �� : ");				//Ű ���� �Է�
		int ky = stdIn.nextInt();
		
		int idx = SeqSearchFor.seqSearch(x, num, ky);	//�迭 x���� Ű ���� ky�� ��Ҹ� �˻�
		
		if(idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		}else {
			System.out.println(ky + "��(��) x["+ idx + "]�� �ֽ��ϴ�.");
		}
	}
}
