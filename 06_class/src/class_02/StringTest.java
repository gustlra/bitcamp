package class_02;

public class StringTest {

	public static void main(String[] args) {
		String a = "apple";//literal 생성
		String b = "apple";
		if(a==b)System.out.println("a와 b의 참조값은 같다");
		else System.out.println("a와 b의 참조값은 다르다");
	

		String c = new String("apple");
		String d = new String("apple");
		if(c==d)System.out.println("c와 d의 참조값은 같다");
		else System.out.println("c와 d의 참조값은 다르다");
		if(c.equals(d))System.out.println("c와 d의 참조값은 같다");			
		else System.out.println("c와 d의 참조값은 다르다");
		
		String e="오늘 날짜는 " +2019+12+30;
		System.out.println("e = "+e);
		
		/*
			싱글톤 - new X 1번만 new
			static 영역
			JVM에 의해서 삭제시 Garbage Collector 보낸다 
			Garbage Collector가 실행되면 컴퓨터는 멈춘다
			문자열은 절대 편집이 안됨
			★ StringBuffer
			1. 문자열
			2. 문자열 편집이 가능
		*/
		
			System.out.println("문자열의 크기 = " +e.length());
			
			for(int i =0; i<e.length(); i++) {
				System.out.println(i+" : "+e.charAt(i));
				
			}
			System.out.println("부분 문자열 추출="+e.substring(7));
			System.out.println("부분 문자열 추출="+e.substring(7,11));//7~11번 이전까지
			
			System.out.println("대문자 변경 ="+ "Hello".toUpperCase());
			System.out.println("대문자 변경 ="+ "Hello".toLowerCase());
			
			System.out.println("문자열 검색 = "+e.indexOf("짜"));
			System.out.println("문자열 검색 = "+e.indexOf("날짜"));
			System.out.println("문자열 검색 = "+e.indexOf("개바부"));//없으면 -1 출력
			
			
		
		}
	
}

