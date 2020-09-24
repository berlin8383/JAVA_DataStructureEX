package com.berlin83.chap04;
/*
 * int�� ����
 * 하하하 처음에 썼던 파일의 한글은 죄다 깨져버렸네;;;
 */

public class Ex4_1A_IntStack {
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
	public Ex4_1A_IntStack(int capacity) {
		// TODO Auto-generated constructor stub
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];				//���� ��ü�� �迭�� ����
			
		}catch(OutOfMemoryError e) {		//������ �� ����
			max = 0;
		}
	}

}
