package chap04;
/*
 * int�� ����
 */

public class Ex4_1C_IntStack {
	private int max;			//���� �뷮
	private int ptr;			//���� ������
	private int[] stk;			//���� ��ü
	
	//���� �� ���� : ������ �������
	public class EmptyIntStackException extends RuntimeException {
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;

		public EmptyIntStackException() {
		}
	}
	
	//���� �� ���� : ������ ������
	public class OverflowItStackException extends RuntimeException{
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;

		public OverflowItStackException() {
		}
	}
	
	//������
	public Ex4_1C_IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];				//���� ��ü�� �迭�� ����
			
		}catch(OutOfMemoryError e) {		//������ �� ����
			max = 0;
		}
		
	}
	
	public int push(int x) throws OverflowItStackException{
		if(ptr >= max) {
			throw new OverflowItStackException();	//������ ������
			
		}
		return stk[ptr++] = x;
	}
	
	//���ÿ��� �����͸� ��(���� �ִ� �����͸� ����)
	public int pop() throws EmptyIntStackException{
		if(ptr <= 0) {						//������ ��� ����
			throw new EmptyIntStackException();
		}
		return stk[--ptr];
			
	}
	
	

}
