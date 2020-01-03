package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class For {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sw;
		while(true) {
			System.out.println("숫자를 입력해주세요.");
			int num = Integer.parseInt(br.readLine());
			if(num==0)break;
			
			for(int i=2; i<=num; i++) {
				if(num % 1  == 0) {
				System.out.println(i+ " ");
				}
			}
			System.out.println();
		}//while
		System.out.println("프로그램을 종료합니다");
	}	
}
