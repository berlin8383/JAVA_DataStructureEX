/*
 * 10의 팩토리얼인 10!은 10 * 9!로 구할수 있고 그우변에서 사용되는 식9!
 * 은 9*8!로 구할수 있습니다. 위의 정의를 그대로 프로그램으로 구현하면 실습
 * 5-1의 factorial메서드와 같습니다.
 */
package chap05;

import java.util.Scanner;

//팩토리얼을 재귀적으로 구현

public class Ex5_1_Factorial {
	//양의 정수 n의 팩토리얼을 반환합니다.
	static int factorial(int n) {
		if(n>0) return n*factorial(n - 1);
		else return 1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int x = stdIn.nextInt();
		
		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
		stdIn.close();
	}

}
