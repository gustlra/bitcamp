package class_01;

/*
	[����2]
	area(3) �� ȣ���Ͽ� ���� ����
	area(5,7)�� ȣ���Ͽ� �ﰢ�� ����
	area(2,3 5)�� ȣ���Ͽ� ��ٸ��� ���̸� ���Ͻÿ�
	
	Ŭ������ : ShapeTest
	�ʵ� : PI (3.141592)
	
	
	[������]
	3*3*3.14 ���� ���� : 28.274337
	5*7/2 �ﰢ���� ���� : 17.5
	2+3*5/2 ��ٸ����� ���� : 12.5
 */

public class Practice2 {
	public static void main(String[] args) {
	ShapeTest st = new ShapeTest();
	//double area5,7 = 5*7/2;
	
	System.out.println("PI : "+st.PI);
	System.out.println("���� ���� : "+st.area(3));
	System.out.println("�ﰢ���� ���� : "+st.area(5,7));
	System.out.println("��ٸ����� ���� : "+st.area(2,3,5));
	
	}
	

}
