package chap03;
/*
 * ���׸� Ŭ������������ ���α׷�
 */
class Ex3C_3_GenericClassTester {
	//���׸� Ŭ������ �Ķ���͸� T��� �ۼ��մϴ�.
	static class GenericClass<T>{
		private T xyz;
		GenericClass(T t){			//������
			this.xyz = t;
		}
		
		T getXyz() {				//xyz�� ��ȯ�մϴ�.
			return xyz;
		}
	}
	
	public static void main(String[] args) {
		//������ ���� �Ķ���Ϳ� String�� �ѱ� ���� �ְ� Integer�� �ѱ� ���� �ֽ��ϴ�.
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> n = new GenericClass<Integer>(15);
		
		System.out.println(s.getXyz());
		System.out.println(n.getXyz());
	}

}
