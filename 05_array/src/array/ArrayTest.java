package array;

public class ArrayTest {
//	int a=3;
//	int b;
//	b=3; -x
	public static void main(String[] args) {
		//������ �����
		//�迭�� 
		//Ŭ����@16����
		int[] ar;
		ar = new int[5];
		 
		ar[0]=25;
		ar[1]=36;
		ar[2]=47;
		ar[3]=55;
		ar[4]=60;
		
		System.out.println("�迭�� ar = "+ar);//toString ����
		System.out.println("�迭�� ar = "+ar.toString());
		System.out.println("�迭ũ�� = "+ar.length);
		
		for(int i=0; i<ar.length; i++) {
			System.out.println("ar["+i+"]= " +ar[i]);
		}
		System.out.println();
		
		System.out.println("���ٷ� ���");
		for(int i=4; i<ar.length-1; i--) {
			System.out.println("ar["+i+"]=" +ar[i]);
		}
		System.out.println();
		System.out.println("Ȧ�������͸� ���");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2==1)
			System.out.println("ar["+i+"]= " +ar[i]);
		}
		System.out.println();
		
		System.out.println("Ȯ�� for");
		for(??? : ar) {//ar�� ũ�⸸ŭ �ݺ��ϸ鼭 ����Ʈ�� ������
			
		}
	}
		
	
}
