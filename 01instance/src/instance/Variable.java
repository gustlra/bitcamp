package instance;

public class Variable {
	public static void main(String[] args) {
		//�޸��Ҵ�
		boolean a; // 1bit
		a = true;
		System.out.println("a = " + a);
		System.out.println('a'+1); // �տ� �Լ� ������ 'a'�� ������ �ڿ� ���ڸ� �־��ָ� 97�� �ν���
		
		char b; //2byte
		b = 'A';
		System.out.println("b = " + b);
		
		char c;
		c = 65; // ���� �ƽ�Ű�ڵ�� �ν�, 65535�� �ִ��ν�  65536-error
		System.out.println("c = " + c);
		
		int d = 65;
		System.out.println("d = " + d);
		
		int e = 'A'; // �ƽ�Ű�ڵ��ν�
		System.out.println("e = " + e);
		
		int f = (int)25L; //25L long�� 
		//int - long X
		//long - int O
		
		//float g = 43.8; �Ǽ����� �⺻��(default) double�� ���� �ν�
		float g = 43.8f; // float
		
		
	}

}
