package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	�̸�(name), �ֹι�ȣ(id)�� �Է��Ͽ� ������ ��� �Ͻÿ�
	����(gender)�� ������ comp()�� ����(age)�� ����ϴ� calcAge() �޼ҵ� �ۼ��Ͻÿ�.
	
	������
	�̸� �Է� : ȫ�浿
	���ڿ��� - �ֹι�ȣ �Է� : 001023-345678 (���̰�� 2019 - 2000+1)
	
	ȫ�浿���� �����̰� 20�� �Դϴ�. 
*/

public class MethodTest4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�̸� �Է� : ");
		String name = br.readLine();
		
		System.out.println("�ֹι�ȣ �Է� : ");
		String id = br.readLine();
		
		MethodTest4 mt = new MethodTest4();
		String gender = mt.comp(id);
		int age = mt.calcAge(id);
		
		
		//int id = Integer.parseInt(br.readLine());
		//���� �����ϱ�(1=>1900��� ���� 2=>1900��� ���� 3=>2000��� ���� 4=>2000��� ����) 
		System.out.println(name+" ���� " +gender+ "�̰� " + age+"�� �Դϴ�.");

	}

	public int calcAge(String id) {
		int age = Integer.parseInt(id.substring(0,2));
		int result = id.charAt(7)=='1' || id.charAt(7)=='2' ? 2019-(age+1900)+1 : 2019-(age+2000)+1;
		return result;
	}

	public String comp(String id) {
		String result = id.charAt(7)=='1' || id.charAt(7)=='3' ? "����" :"����";
		return result;
	}

}
