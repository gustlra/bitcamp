package instance;

public class Practice5 {
	/*	[����5]
	���� score�� ���� 2�� 3�� ��������� �ƴ����� ����Ͻÿ� (���� score ���� ����)
	(�������� 0�̵ȴ�)
	[������]
	25�� 2�� 3�� ������� �ƴϴ� (score=25�϶�)
	�Ǵ�
	12�� 2�� 3�� ������̴� (score=12�϶�)
	 */
	public static void main(String[] args) {
	
		int score = 12;
		String result = score%2==0 && score%3==0 ? "�������" : "������� �ƴϴ�";
		System.out.println(score+ "�� 2�� 3��"+ result);
		
	}

}
