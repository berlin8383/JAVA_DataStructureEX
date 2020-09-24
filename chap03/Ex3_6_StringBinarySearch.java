package com.berlin83.chap03;

import java.util.Arrays;
import java.util.Scanner;


/*
 * 자연 정렬로 정렬된 배열에서 검색하기
 * 다음은 자연 정렬에서 대소 관계를 비교하는 메서드를 사용하여 검색하는 프로그램입니다.
 * 검색 대상인 x는 문자열 배열입니다. 문자열을 ky에 입력하고 배열 x와 키 값 ky를 binarySearch
 * 메서드에 전달하면 검색할 수 있습니다.
 */

//문자열의 배열(Java의 키워드)에서 검색
public class Ex3_6_StringBinarySearch {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//java에서 사용하는 키워드 입니다.
		String[] x = {
				"abstract",	"assert",	"boolean",	"break",	"byte",
				"case",		"catch",	"char",		"class",	"const",
				"continue",	"default",	"do",		"double",	"else",
				"enum",		"extends",	"final",	"finally",	"float",
				"for",		"goto",		"if",		"implements","import",
				"instanceof","int",		"interface","long",		"native",
				"new",		"package",	"private",	"protected","public",
				"return",	"short",	"static",	"strictfp", "super",
				"switch",	"synchronized","this",	"throw",	"throws",
				"transient","try",		"void",	"volatile",		"while"
		};
		
		System.out.print("원하는 키워드를 입력하세요 : ");	//키 값을 입력
		String ky = stdIn.next();
		
		int idx = Arrays.binarySearch(x, ky);		//배열 x에서 값이 ky인 요소를 검색
		
		if(idx < 0) {
			System.out.println("해당 키워드가 없습니다.");
		}else {
			System.out.println("해당 키워드는 x["+ idx + "]에 있습니다.");
		}
		
		}
	
	}
