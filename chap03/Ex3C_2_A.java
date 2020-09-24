package com.berlin83.chap03;
/*
 * 자연스러운 정렬을 하려면 다음과 같은 방법으로 클래스를 정의합니다.
 */
public class Ex3C_2_A implements Comparable<Ex3C_2_A> {
	
	//필드, 메서드 등
	
	public int compareTo(Ex3C_2_A c) {
		//this가 c보다 크면 양의 값을 변환
		//this가 c보다 작으면 음의 값 반환
		//this가 c와 같으면 0 반환
		
		return 0;
		
	}
	
	public boolean equals(Object c) {
		//this가 c와 같으면 true 반환
		//this가 c와 같지 않으면 faise 반환
		return false;
	}
	

}
