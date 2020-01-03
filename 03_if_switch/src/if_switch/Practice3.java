package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	[문제3]
	숫자를 입력하여 약수를 구하시오
	
	[실행결과]
	숫자 입력 : 12
	1   2   3   4   6   12
	
	가능o
	for {
		if
	}n
	불가능x
	if{
		for
	}
*/

public class Practice3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("숫자를 입력하여 약수를 구하시오.");
		System.out.println("[실행결과]");
		System.out.println("숫자 입력 : ");
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
