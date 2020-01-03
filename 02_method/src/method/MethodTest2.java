package method;

public class MethodTest2 {
	
	public static void disp() //구현 내가만든함수 
		{
		System.out.println("static method");
	}
	
	public void output() {
		System.out.println("non-static method");
	}

	public static void main(String[] args) {
		MethodTest2.disp();//호출
		
		// new MethodTest2().output();//호출
		MethodTest2 aa = new MethodTest2();//주소값 보관
		System.out.println("aa = "+aa);//클래스 @ 16진수로 표기
		System.out.println("aa = "+aa.toString()); //toString - 주소보관위치
		System.out.println("aa = "+aa.hashCode()); //hashCode - 10진수로
		
		aa.output();//호출
		System.out.println();
		
		int sum = aa.plus(25,36);
		int sub = aa.minus(25,36);
		int mul = aa.multiply(25,36);
		double div = aa.divide(25,36);
				
		System.out.println("25 + 36 =" +sum);
		System.out.println("25 - 36 =" +sub);
		System.out.println("25 * 36 =" +mul);
		System.out.println("25 / 36 =" +div);
		
		
	}

	public int plus(int a,int b){
		return a+b;
	}
	public int minus(int a,int b){
		return a-b;
	}
	public int multiply(int a,int b){
		return a*b;
	}
	public double divide(int a,int b){
		return (double)a/b;
	}

}
