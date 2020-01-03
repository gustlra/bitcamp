package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	숫자맞추기 게임
	1~100 사이의 난수를 발생하여 맞추는 게임
	[실행결과]
	숫자 입력 : 50
	50보다 큽니다
	
	숫자 입력 :
	50보다 작습니다.
	
	숫자 입력 : 87
	딩동댕 xx번만에 맞추셨습니다.

*/

public class NumberGame {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int com, user, count;
		String yn;
		do {
			count = 0;
			com = (int)(Math.random()*100)+1;//1~100까지 난수
			while(true) {
				System.out.print("숫자 입력 : ");
				user = Integer.parseInt(br.readLine());
				count++;
				 
				if(com==user) break; 
				if(com > user) {
					System.out.print(user + "보다 큽니다");
				}else {
					System.out.print(user + "보다 작습니다");
				}
				System.out.println();
			}//while
		
			System.out.println("딩동댕" +count+ "번만에 맞추셨습니다");
			System.out.println();
			
			System.out.println("\n 또할래?(Y/N) : ");
			yn = br.readLine();//String은 == X / String 은 ?.equals로 사용
			
			if(yn.equals("n") || yn.equals("N")) break;
			
		}while(true);
				
		System.out.println("프로그램을 종료합니다.");
			
	}
}



