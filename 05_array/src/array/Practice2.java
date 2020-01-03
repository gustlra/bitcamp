package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	[문제2]
	10진수를 입력하여 2진수로 변환하시오
	0이 입력되면 프로그램을 종료하세요
	음수가 입력되면 재입력하세요
	4개씩 끊어서 보여주기
	Integer.toBinaryString() 쓰지마삼
	
	[실행결과]
	10진수 입력 : -5
	
	10진수 입력 : 250
	1111 1010 
	
	10진수 입력 : 12
	1100
	
	10진수 입력 : 0
	프로그램을 종료
 */
public class Practice2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] binary = new int[32];
		int dec;
		
		while(true) {
			System.out.println("10진수 입력 : ");
			dec = Integer.parseInt(br.readLine());
			if(dec==0) break;
			if(dec<0) continue;
			int i;
			for( i=0; dec!=0; i++) {
				binary[i] = dec%2;
				dec = dec/2;
			}//for
			 
			
			for(int j=i-1; j>=0; j--) {
				System.out.print(binary[j]);
				if(j%4==0) System.out.println(" ");
				
			}
			System.out.println();
		}//while
		System.out.println("프로그램을 종료합니다.");
		
		
/*		int[] s = new int[32];
		System.out.println("10진수 입력 : ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println();
		 
		for(int i=0; i<s.length; i++) {
			s[i] = a%2;
			a=a/2;
		}
		for(int i=s.length-1; i>= 0; i--) {
			System.out.print(s[i]);
		} 
*/
		
		

	}

}
