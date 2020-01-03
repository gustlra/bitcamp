package instance;

public class Practice6 {

	public static void main(String[] args) {
	/*
		ch에 있는 데이터가 대문자이면 소문자로 출력하고 아니면(소문자) 대문자로 출력하시오
		[실행결과]
		T → t (ch에 T에 있을 때) 
		또는
		e → E (ch에 e가 있을 때)
	*/
		char ch = 'E';
		System.out.println("변경전 : " + ch);
		char result = ch >= 65 && ch <= 90 ? (char)(ch+32) : (char)(ch-32);
		System.out.println("변경후 : " + result);
	}

}
