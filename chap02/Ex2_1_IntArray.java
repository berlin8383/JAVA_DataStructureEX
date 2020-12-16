package chap02;
/*
 * �ǽ� 2-1�� ���α׷����� �迭�� Ư���� Ȯ���� ���ڽ��ϴ�.
 * ���� ����� �ڷ����� int ���� �迭(���� ��ڼ��� 5 : new�� ���� ��ü�� ����)
 * �迭�� 0��° ���� ������
 */

public class Ex2_1_IntArray {

	public static void main(String[] args) {
		
		int[] a = new int[5];//�迭�� ����
		
		a[1] = 37; //a[1]�� 37�� ����
		a[2] = 51; //a[2]�� 51�� ����
		a[4] = a[1] * 2; //a[4]�� a[1]*2, �� 74�� ����
		
		for(int i =0; i <a.length; i++) {
			System.out.println("a["+i+"] = "+ a[i]);
		}

	}

}
