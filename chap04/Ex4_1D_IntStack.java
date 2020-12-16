package chap04;
/*
 * int�� ����
 */

import chap04.Ex4_1C_IntStack.EmptyIntStackException;

public class Ex4_1D_IntStack {
	private int max;			//���� �뷮
	private int ptr;			//���� ������
	private int[] stk;			//���� ��ü
	
	//���� �� ���� : ������ �������
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}		
	}
	
	//���� �� ���� : ������ ������
	public class OverflowItStackException extends RuntimeException{
		public OverflowItStackException() {}
	}
	
	//������
	public Ex4_1D_IntStack(int capacity) {
		// TODO Auto-generated constructor stub
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
	
	//���ÿ��� �����͸� ��ũ(���� �ִ� �����͸� �鿩�ٺ�)
		public int peek() throws EmptyIntStackException{
			if(ptr <= 0) {						//������ ��� ����
				throw new EmptyIntStackException();
			}
			return stk[ptr -1];
		}
	
	

}
