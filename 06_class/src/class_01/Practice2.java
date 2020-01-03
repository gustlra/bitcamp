package class_01;

/*
	[문제2]
	area(3) 를 호출하여 원의 넓이
	area(5,7)를 호출하여 삼각형 넓이
	area(2,3 5)를 호출하여 사다리꼴 넓이를 구하시오
	
	클래스명 : ShapeTest
	필드 : PI (3.141592)
	
	
	[실행결과]
	3*3*3.14 원의 넓이 : 28.274337
	5*7/2 삼각형의 넓이 : 17.5
	2+3*5/2 사다리꼴의 넓이 : 12.5
 */

public class Practice2 {
	public static void main(String[] args) {
	ShapeTest st = new ShapeTest();
	//double area5,7 = 5*7/2;
	
	System.out.println("PI : "+st.PI);
	System.out.println("원의 넓이 : "+st.area(3));
	System.out.println("삼각형의 넓이 : "+st.area(5,7));
	System.out.println("사다리꼴의 넓이 : "+st.area(2,3,5));
	
	}
	

}
