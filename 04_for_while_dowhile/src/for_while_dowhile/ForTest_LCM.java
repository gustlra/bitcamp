package for_while_dowhile;
/*
	1~500������ ������ 100�� �߻��Ͽ� 2�� 3�� ������� ����ϰ� �հ� ������ ������ÿ�.
	�� 1�ٿ� 7���� ����Ͻÿ�
	
	[������]
	36 12...
	2�� 3�� ����� ���� = 
	2�� 3�� ����� �� = 
 */

public class ForTest_LCM {

	public static void main(String[] args) {
		int num, sum=0, count=0;
		
		for(int i=1; i<=100; i++) {
			num = ((int)(Math.random()*500)+1);
			if(num%2==0 && num%3==0) {
				System.out.print(String.format("%5d", num)); 
				count++;
				if(count%7==0) System.out.println();
				sum += num;
			}
		}//for
		System.out.println();
		System.out.println("2�� 3�� ����� ���� = "+count);
		System.out.println("2�� 3�� ����� �� = "+sum);
		
		
		
		//]int num = (int)(Math.random()*500+1);
		//System.out.println(num);
//		int num;
//		int sum=0;
//		int count=0;
//		
//		for(int i=1; i<100; i++) {
//			
//			num = (int)(Math.random()*500+1);
//			System.out.print(num+" ");
//			if((i%2==0) && (i%3==0)) {
//				
//				System.out.println("i="+i+" ");
//				sum +=num;
//				count++;
//			}
//		}
//		System.out.println();
//		System.out.println("2�� 3�� ����� ���� = " +count);
//		System.out.println("2�� 3�� ������� �� = " +sum);

	}
}