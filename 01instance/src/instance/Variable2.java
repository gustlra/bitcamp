package instance;

public class Variable2 {
		int a;//field
		static int b;
		String str;
		
		public static void main(String[] args) {			
			int a=10; //local veriable(��������) �ݵ�� �ʱ�ȭ
			System.out.println("���� a="+a);
			System.out.println("�ʵ� a="+ new Variable2().a);
			System.out.println("�ʵ� b="+ Variable2.b);
			System.out.println("�ʵ� str = " + new Variable2().str);
			System.out.println('1'+'1');
		}

}
