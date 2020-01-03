package method;

public class Boxing {

	public static void main(String[] args) {
		int a = 25;
		double b = (double)a/3;
		
		int c = 5;
		Integer d = c; //Autoboxing 기본형 -> 객체형
		//Integer d = new Integer(c); jdk 5.0이전
		
		Integer e = 5;
		int f = e; //unAutoBoxing
		//int f = e.intValue(); JDK 5.0이전
		
		System.out.println(a);
		System.out.println(b); //cast연산 - 형변형

	}

}
