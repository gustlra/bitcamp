package instance;

public class Practice3 {

	public static void main(String[] args) {
		//�̸��� L(name)�� ����� �⺻��(basePay)�� 2500000�϶� 3.3% ����(tax)�� ����(salary)�� ����Ͻÿ�. �����ʹ� �ݵ�� ������ �����ϱ�.
		//���� = �⺻�� * 3.3%(0.033)
		//���� = �⺻��-����
		int b = 2500000; //�⺻��
		double c = 0.033; //����
		int d = (int) (b*c);
		int e = b-d;
		
		System.out.println("L�ǿ���");
		System.out.println("�⺻��="+b+"�� \t ����="+d+"�� \t ����="+e+"��");
		/*	 
		 * 
		 
			
		
		System.out.println("L���� = " +b*c);
		
		double d = b*c;
		
		System.out.println("L���� = " +b-d);
		*/
	}

}
