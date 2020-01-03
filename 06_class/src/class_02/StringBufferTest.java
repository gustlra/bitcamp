package class_02;

import java.util.Scanner;

public class StringBufferTest {
	private int dan;
	
	public StringBufferTest(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 단을 입력 : ");
		dan = sc.nextInt();
		
	}
	public void output() {
		StringBuffer sb = new StringBuffer();
		
		for(int i = 1; i<10; i++) {
			//System.out.println(dan+"*"+i+"="+dan*i);
			sb.append(dan);
			sb.append("*");
			sb.append(i);
			sb.append("=");
			sb.append(dan*i);
			
			System.out.println(sb.toString());
			sb.delete(0,sb.length()); //start ~ end-1
		}//for
	}
	public static void main(String[] args) {
		new StringBufferTest().output();

	}

}
