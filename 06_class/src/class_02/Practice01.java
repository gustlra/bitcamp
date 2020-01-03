package class_02;

import java.util.Scanner;

/*
	[문제1]
	치환하는 프로그램을 작성하시오
	String 클래스의 메소드(indexOf(), replace())를 이용하시오
	대소문자 상관없이 개수를 계산하시오
	
	[실행결과]
	문자열 입력 : aabba
	현재 문자열 입력 : aa
	바꿀 문자열 입력 : dd
	ddbba
	1번 치환
	
	문자열 입력 : aAbbA
	현재 문자열 입력 : aa
	바꿀 문자열 입력 : dd
	ddbba
	1번 치환
	
	문자열 입력 : aabbaa
	현재 문자열 입력 : aa
	바꿀 문자열 입력 : dd
	ddbbdd
	2번 치환
	
	문자열 입력 : AAccaabbaaaaatt
	현재 문자열 입력 : aa
	바꿀 문자열 입력 : dd
	ddccddbbddddatt
	4개 치환
	
	문자열 입력 : aabb
	현재 문자열 입력 : aaaaa
	바꿀 문자열 입력 : ddddd
	입력한 문자열의 크기가 작습니다
 */

public class Practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index=0;//위치
		int count=0;//개수
		System.out.println("문자열 입력 : ");
		String str = sc.next();
		
		
		System.out.println("현재 문자열 입력 : ");
		String target = sc.next();
		
		System.out.println("바꿀 문자열 입력 : ");
		String replacing = sc.next();
		
		if(str.length() < target.length()) {
			System.out.println("입력한 문자열의 크기가 작습니다.");
			return;
		}
		str = str.toLowerCase();
		target = target.toLowerCase();

		while((index=str.indexOf(target, index)) != -1) {
			index += target.length();
			count++;
		}//while
		
//		for(int i =0; i<str.length(); i++) {
//			if(str.contains("aa")) {
//				str = str.replaceFirst("aa", "dd");
//				count++;
//			}else {
//				break;
//			}
//		}
//		//("aa",str.indexOf("aa")+1);
//		
		

		System.out.println(str.replace(target, replacing));
		System.out.println(count+"번 치환했습니다."); 
		System.out.println();
		
	}


}
