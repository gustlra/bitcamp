package instance;
/*
 	�ֻ����� 2�� ������ ���� ���� ���� ���Ͻÿ�
	�ֻ����� input()���� 1~6������ ������ �߻��Ͽ� �����Ѵ�
	���� add()���� ���Ͽ� ���� �޴´�
*/

public class Practice9 {

	public static void main(String[] args) {

		Practice9 p9 = new Practice9();

		int su1 = p9.input();
		System.out.println("ù��° �ֻ��� �� : " + su1);
		int su2 = p9.input();
		System.out.println("�ι�° �ֻ��� �� : " + su2);

		System.out.println("���� " + p9.add(su1, su2) + " �̴�");
	}
	
	public int input() {
		int su = (int) (Math.random() * 6 + 1);
		return su;
	}

	public int add(int su1, int su2) {
		return su1 + su2;
	}

}
