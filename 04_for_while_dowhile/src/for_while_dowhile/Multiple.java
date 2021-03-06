package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	숫자를 입력하여 배수를 7개만 구하시오
	단 음수이면 다시 입력하면 0이면 종료하시오
	
	[실행결과]
	숫자 입력 : -7
	숫자 입력 : 8
	8 16 24 32 40 48 56
	
	숫자 입력 : 0 
	프로그램을 종료합니다
 */

public class Multiple {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		
		while(true) {
			System.out.println("숫자 입력 : ");
			num = Integer.parseInt(br.readLine());
			if(num==0) break; // 끝내라
			if(num<0) continue; // 다시 돌아가라
			
			//배수 
			for(int i=1; i<=7; i++) {
				System.out.print(num*i+" ");
			}
			System.out.println();
			
		}//while
		System.out.println("프로그램을 종료합니다");
	
	}

}
