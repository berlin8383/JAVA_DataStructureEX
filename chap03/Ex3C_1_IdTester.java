package chap03;
/*
 * Ŭ���� ������(public Id())�� ������ �ֽ��ϴ�. �׸��� �ν��Ͻ��� ������ 
 * ������ ������ �ν��Ͻ��� 1,2,...�� ���̵� �ο��մϴ�. �ڵ��� ȸ�� �κ��� Ŭ����, 
 * ���� �κ��� �ν��Ͻ���� �����ϸ� �˴ϴ�.
 */

class Id{
	//���̵� �ο��ϴ� Ŭ����

	private static int counter = 0;		//���̵� �� �� �ο��ߴ��� ����
	private int id;						//���̵�
	
	//������
	public Id() {id = ++counter;}
	
	//���̵� ��ȯ�ϴ� �ν��Ͻ� �޼���
	public int getId() {return id;}
	
	//counter�� ��ȯ�ϴ� Ŭ���� �ż���
	public static int getCounter() { return counter;}
	
	
}


public class Ex3C_1_IdTester {
	public static void main(String[] args) {
		Id a = new Id();				//���̵�1
		Id b = new Id();				//���̵�2
		
		System.out.println("a�� ���̵� : " +  a.getId());
		System.out.println("b�� ���̵� : " + b.getId());
		
		System.out.println("�ο��� ���̵��� ���� : " + Id.getCounter());
	}
}
