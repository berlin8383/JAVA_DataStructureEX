package chap02;
/*
 * �迭�� ��ڰ��� �ʱ�ȭ�ϸ� �迭 �����ϱ�
 * �迭 ��ü�� �迭 �ʱ�ȭ(array initializer)�� ����ϸ� �迭 ��ü�� ������ ���ÿ� �� �����
 * �ʱ�ȭ�� �����մϴ�. ���� ���α׷��� ���� �ǽ��� ���ڽ��ϴ�.
 * ���� �ڷ����� int���� �迭(���� ��ڼ��� 5 : �迭 �ʱ��ڿ� ���� ����)
 */

public class Ex2_2_IntArrayInit {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5}; //�迭 �ʱ��ڿ� ���� ����
		
		for(int i =0; i <a.length; i++)
			System.out.println("a["+i+"] = " +a[i]);

	}

}
