package for_while_dowhile;

/*
	A~Z 무작위로 100개를 출력하시오 65~90
	[실행결과]
	A E BFERCFADF.....
*/
public class forTest_Random {

	public static void main(String[] args) {
		int num;
		int count=0;//A개수를 담을 거
		for(int i=1; i<=100; i++) {
		num = (int)(Math.random()*26+65);//65~90
		System.out.print((char)num+" ");
		if(num=='A') count++;// A개수
		if(i%10==0) System.out.println();
		}
		System.out.println("A가 몇개인가요 = " +count);
	
	}

}
