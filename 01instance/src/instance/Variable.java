package instance;

public class Variable {
	public static void main(String[] args) {
		//메모리할당
		boolean a; // 1bit
		a = true;
		System.out.println("a = " + a);
		System.out.println('a'+1); // 앞에 함수 떄문에 'a'로 나오고 뒤에 숫자를 넣어주면 97로 인식함
		
		char b; //2byte
		b = 'A';
		System.out.println("b = " + b);
		
		char c;
		c = 65; // 기계는 아스키코드로 인식, 65535가 최대인식  65536-error
		System.out.println("c = " + c);
		
		int d = 65;
		System.out.println("d = " + d);
		
		int e = 'A'; // 아스키코드인식
		System.out.println("e = " + e);
		
		int f = (int)25L; //25L long형 
		//int - long X
		//long - int O
		
		//float g = 43.8; 실수형은 기본이(default) double형 으로 인식
		float g = 43.8f; // float
		
		
	}

}
