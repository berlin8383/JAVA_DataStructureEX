/*
 * 소수의 나열
 * 어떤 정수 이하의 소수를 모두 나열하는 알고리즘을 살펴보겠습니다. 소수는 자신과 1 이외의 정수로 나누어 떨어지지않는 정수 입니다.
 * 예를 들어 소수인 13은 2,3,....,12가운데 어떤 정수로도 나누어 떨어지지 않습니다. 그러므로 어떤 정수 n에 대하여 아래의 조건을 
 * 만족하면 소수임을 알수 있습니다.
 * 2부터 n-1까지의 어떤 정수로도 나누어 떨어지지 않습니다.
 * 만약 나누어 떨어지는 정수가 하나 이상 존재하면 그 수는 합성수(composite number)입니다.
 * 다음 실습 2-9는 1,000이하의 소수를 나열하는 프로그램입니다.
 */
package com.berlin83.chap02;
//1,000 이하의 소수를 열거(버전1)

public class Ex2_9_PrimeNumber1 {
	
	public static void main(String[] args) {
		int counter = 0;		//나눗셈의 횟수
		
		for(int n=2; n <=1000; n++) {
			int i;
			for(i=2; i <n; i++) {
				counter++;
				if(n % i ==0) {	//나누어 떨어지면 소수가 아님
					break;		//더 이상의 반복은 불필요
				}
			}
			if(n==i) {				//마지막까지 나누어 떨어지지 않음
				System.out.println(n);
			}
		}
		
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	}

}
