package instance;

/*
	����
	320, 258�� ������ �����Ͽ� ���� ���Ͻÿ� 
	[���]
	320 + 258 = xxx
	a + b = sum
 */
/*
 	����
 	320 - 358 = xxx(sub)
 	320 * 258 = xxx(mul)
 	320 / 258 = 1.24~~~(div)
 	
 	�߰�����  320 / 258 string����
 */
public class NumberTest {

	public static void main(String[] args) {
		
		short a = 320;
		short b = 258;
		int sum = a+b; // ����ȯ�� �����ʿ����� ����X
		int sub = a-b;
		int mul = a*b;
		//String div = String.format("%.2f",(double)a/b;
		double div = (double)a/b;
		
		System.out.println(a+" + "+b+" = "+sum);
		System.out.println(a+" - "+b+" = "+sub);
		System.out.println(a+" * "+b+" = "+mul);
		System.out.println(a+" / "+b+" = "+ String.format("%.2f" , div)); //Stirng.format("%.?f", ?)�Ҽ��� ��� ����Ұ�

	}

}
