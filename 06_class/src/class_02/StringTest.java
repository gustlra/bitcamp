package class_02;

public class StringTest {

	public static void main(String[] args) {
		String a = "apple";//literal ����
		String b = "apple";
		if(a==b)System.out.println("a�� b�� �������� ����");
		else System.out.println("a�� b�� �������� �ٸ���");
	

		String c = new String("apple");
		String d = new String("apple");
		if(c==d)System.out.println("c�� d�� �������� ����");
		else System.out.println("c�� d�� �������� �ٸ���");
		if(c.equals(d))System.out.println("c�� d�� �������� ����");			
		else System.out.println("c�� d�� �������� �ٸ���");
		
		String e="���� ��¥�� " +2019+12+30;
		System.out.println("e = "+e);
		
		/*
			�̱��� - new X 1���� new
			static ����
			JVM�� ���ؼ� ������ Garbage Collector ������ 
			Garbage Collector�� ����Ǹ� ��ǻ�ʹ� �����
			���ڿ��� ���� ������ �ȵ�
			�� StringBuffer
			1. ���ڿ�
			2. ���ڿ� ������ ����
		*/
		
			System.out.println("���ڿ��� ũ�� = " +e.length());
			
			for(int i =0; i<e.length(); i++) {
				System.out.println(i+" : "+e.charAt(i));
				
			}
			System.out.println("�κ� ���ڿ� ����="+e.substring(7));
			System.out.println("�κ� ���ڿ� ����="+e.substring(7,11));//7~11�� ��������
			
			System.out.println("�빮�� ���� ="+ "Hello".toUpperCase());
			System.out.println("�빮�� ���� ="+ "Hello".toLowerCase());
			
			System.out.println("���ڿ� �˻� = "+e.indexOf("¥"));
			System.out.println("���ڿ� �˻� = "+e.indexOf("��¥"));
			System.out.println("���ڿ� �˻� = "+e.indexOf("���ٺ�"));//������ -1 ���
			
			
		
		}
	
}

