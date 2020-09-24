package com.berlin83.chap04;
/*
 * int형 스택
 */

public class Ex4_1C_IntStack {
	private int max;			//스택 용량
	private int ptr;			//스택 포인터
	private int[] stk;			//스택 본체
	
	//실행 시 예외 : 스택이 비어있음
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}		
	}
	
	//실행 시 예외 : 스택이 가득참
	public class OverflowItStackException extends RuntimeException{
		public OverflowItStackException() {}
	}
	
	//생성자
	public Ex4_1C_IntStack(int capacity) {
		// TODO Auto-generated constructor stub
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];				//스택 본체용 배열을 생성
			
		}catch(OutOfMemoryError e) {		//생성할 수 없음
			max = 0;
		}
		
	}
	
	public int push(int x) throws OverflowItStackException{
		if(ptr >= max) {
			throw new OverflowItStackException();	//스텍이 가득참
			
		}
		return stk[ptr++] = x;
	}
	
	//스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
	public int pop() throws EmptyIntStackException{
		if(ptr <= 0) {						//스택이 비어 있음
			throw new EmptyIntStackException();
		}
		return stk[--ptr];
			
	}
	
	

}
