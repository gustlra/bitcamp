package class_02;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str = "�п�,��,,���ӹ�";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("��ū ���� = " + st.countTokens());
		
		while(st.hasMoreTokens());{//��ū �ִ��� ������ üũ
			System.out.println(st.nextToken());//��ū�� ������ �������� �̵�
		}
		System.out.println("-------------");
		
		String[] ar = str.split(",");
		for(String data : ar) {
			System.out.println(data);
		}

	}

}
