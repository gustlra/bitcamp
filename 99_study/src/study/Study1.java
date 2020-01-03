package study;

/*
	이름(name), 주민번호(id)를 입력하여 성별을 출력 하시오
	성별(gender)을 구별는 comp()와 나이(age)를 계산하는 calcAge() 메소드 작성하시오.
	
	실행결과
	이름 입력 : 홍길동
	문자열로 - 주민번호 입력 : 001023-345678 (나이계산 2019 - 2000+1)
	
	홍길동님은 남자이고 20살 입니다. 
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("이름 입력 : ");
		String name = br.readLine();
		System.out.println("주민번호 입력 : ");
		String id = br.readLine();
		
		

	}

}
