package class_01;

public class ShapeTest {
	static final double PI = 3.141592;//final ���ȭ -static final ��Ʈ�ξ�  
	
	
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
