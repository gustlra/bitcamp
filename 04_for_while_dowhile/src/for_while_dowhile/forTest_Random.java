package for_while_dowhile;

/*
	A~Z �������� 100���� ����Ͻÿ� 65~90
	[������]
	A E BFERCFADF.....
*/
public class forTest_Random {

	public static void main(String[] args) {
		int num;
		int count=0;//A������ ���� ��
		for(int i=1; i<=100; i++) {
		num = (int)(Math.random()*26+65);//65~90
		System.out.print((char)num+" ");
		if(num=='A') count++;// A����
		if(i%10==0) System.out.println();
		}
		System.out.println("A�� ��ΰ��� = " +count);
	
	}

}
