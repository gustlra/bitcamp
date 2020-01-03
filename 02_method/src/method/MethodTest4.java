package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	이름(name), 주민번호(id)를 입력하여 성별을 출력 하시오
	성별(gender)을 구별는 comp()와 나이(age)를 계산하는 calcAge() 메소드 작성하시오.
	
	실행결과
	이름 입력 : 홍길동
	문자열로 - 주민번호 입력 : 001023-345678 (나이계산 2019 - 2000+1)
	
	홍길동님은 남자이고 20살 입니다. 
*/

public class MethodTest4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("이름 입력 : ");
		String name = br.readLine();
		
		System.out.println("주민번호 입력 : ");
		String id = br.readLine();
		
		MethodTest4 mt = new MethodTest4();
		String gender = mt.comp(id);
		int age = mt.calcAge(id);
		
		
		//int id = Integer.parseInt(br.readLine());
		//성별 구별하기(1=>1900년대 남자 2=>1900년대 여자 3=>2000년대 남자 4=>2000년대 여자) 
		System.out.println(name+" 님은 " +gender+ "이고 " + age+"살 입니다.");

	}

	public int calcAge(String id) {
		int age = Integer.parseInt(id.substring(0,2));
		int result = id.charAt(7)=='1' || id.charAt(7)=='2' ? 2019-(age+1900)+1 : 2019-(age+2000)+1;
		return result;
	}

	public String comp(String id) {
		String result = id.charAt(7)=='1' || id.charAt(7)=='3' ? "남자" :"여자";
		return result;
	}

}
