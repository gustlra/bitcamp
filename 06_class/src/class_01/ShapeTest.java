package class_01;

public class ShapeTest {
	static final double PI = 3.141592;//final 상수화 -static final 세트로씀  
	
	
	public double area(int a) {
		return a*a*PI;
	}
	public double area(int a, int b) {
		return (double)a*b/2;	
	}
	public double area(int a, int b, int c) {
		return (double)((a+b)*c)/2;
	}
	
	
	
}
