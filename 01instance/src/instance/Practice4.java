package instance;

public class Practice4 {

	public static void main(String[] args) {
		// [����4] �̸�(name) ȫ�浿�̰� ��������(kor) 90 ��������(eng) 85 ��������(math) 100�� �϶� ����(tot)�� ���(avg)�� ���Ͻÿ�
		// �� ����� �Ҽ����� 2°�ڸ����� ǥ���Ͻÿ�
		//[������]
		//	�̸�	����	����	����	����	���
		// ȫ�浿	90	80	100	xxx	xx.xx
		
		String a = "ȫ�浿";
		short kor = 90;
		short eng = 85;
		short math = 100;
		
		double tot = kor+eng+math;
		double avg = tot/3;
		
		System.out.println("�̸�"+"\t ����"+"\t ����"+"\t ����"+"\t ����"+"\t ���");
		System.out.println(a + "\t"+kor+ "\t"+eng+ "\t"+math+ "\t"+(int)tot+ "\t" +String.format("%.2f", avg));
		
		
		
		
		/*/
		System.out.println("������ "  +kor+ "+" +eng+ "+" +math+ " = " +(int)tot);
		 
		
		double avg = tot/3;
		System.out.println("����� = "+ String.format("%.2f", avg));
		*/
		
	}

}
