package instance;

public class Practice6 {

	public static void main(String[] args) {
	/*
		ch�� �ִ� �����Ͱ� �빮���̸� �ҹ��ڷ� ����ϰ� �ƴϸ�(�ҹ���) �빮�ڷ� ����Ͻÿ�
		[������]
		T �� t (ch�� T�� ���� ��) 
		�Ǵ�
		e �� E (ch�� e�� ���� ��)
	*/
		char ch = 'E';
		System.out.println("������ : " + ch);
		char result = ch >= 65 && ch <= 90 ? (char)(ch+32) : (char)(ch-32);
		System.out.println("������ : " + result);
	}

}
