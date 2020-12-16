package chap01;
/*
 * ���� ���� 
 * ���ݱ��� �ٷ� ���α׷��� �ܼ��� �ݺ��� �����߽��ϴ�. ������ �ݺ� �ȿ��� �ٽ� �ݺ��� ���� 
 * �ֽ��ϴ�. �̷� �ݺ��� ������ ��ø�Ǵ� ���ؿ� ���� '���� ����, ���� ����'��� �մϴ�.
 * 
 * ����ǥ
 * �ǽ� 1-7�� ���� ������ ����ϴ� �˰������� ���� ����ǥ�� ����ϴ� ���α׷��Դϴ�.
 */

public class Ex1_7_2Multi99Table {

	public static void main(String[] args) {
		System.out.println("-------����ǥ-----");
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%3d",i*j);
			}
			System.out.println();
		}

	}

}
