package method;

public class Boxing {

	public static void main(String[] args) {
		int a = 25;
		double b = (double)a/3;
		
		int c = 5;
		Integer d = c; //Autoboxing �⺻�� -> ��ü��
		//Integer d = new Integer(c); jdk 5.0����
		
		Integer e = 5;
		int f = e; //unAutoBoxing
		//int f = e.intValue(); JDK 5.0����
		
		System.out.println(a);
		System.out.println(b); //cast���� - ������

	}

}
