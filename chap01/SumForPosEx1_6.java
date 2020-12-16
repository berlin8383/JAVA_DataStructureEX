package chap01;

import java.util.Scanner;

/*
 * 1,2,... ,n�� ���� ���մϴ�.(����� �Է�).
 */

public class SumForPosEx1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		
		do {
			System.out.print("n�� �� : ");
			n=stdIn.nextInt();
			
		}while(n<=0);
		
		@SuppressWarnings("unused")
		int sum = 0;
		
		for(int i=1;i<=n;i++) {
			sum+=i;
		}

	}

}
