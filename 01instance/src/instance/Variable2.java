package instance;

public class Variable2 {
		int a;//field
		static int b;
		String str;
		
		public static void main(String[] args) {			
			int a=10; //local veriable(지역변수) 반드시 초기화
			System.out.println("지역 a="+a);
			System.out.println("필드 a="+ new Variable2().a);
			System.out.println("필드 b="+ Variable2.b);
			System.out.println("필드 str = " + new Variable2().str);
			System.out.println('1'+'1');
		}

}
