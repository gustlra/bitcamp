package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	[문제4] 야구게임
	크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
	발생한 수를 맞추는 게임
	중복은 제거한다
	
	[실행결과]
	게임을 실행하시겠습니까(Y/N) : w
	게임을 실행하시겠습니까(Y/N) : u
	게임을 실행하시겠습니까(Y/N) : y
	
	게임을 시작합니다
	
	숫자입력 : 123
	0스트라이크 0볼
	
	숫자입력 : 567
	0스트라이크 2볼
	
	숫자입력 : 758
	1스트라이크 2볼
	...
	
	숫자입력 : 785
	3스트라이크 0볼
	
	컴퓨터 : com
	사용자 : user
*/

public class Practice4 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int com[] = new int[3];
		int user[] = new int[3];
		
		while(true) {
			System.out.println("게임을 실행하시겠습니까(Y/N) : ");
			String choice = br.readLine();
			if(choice.equals("Y") || choice.equals("y")) {
				System.out.println("게임을 시작합니다");
				for()
				com[] = (int)(Math.random()*9)+1;		
				System.out.println("숫자 입력 : ");
				int user = Integer.parseInt(br.readLine()); 
				
			}else if(choice.equals("N") || choice.equals("n")) {
				System.out.println("프로그램 종료");break;
			}else {
				
			}
		}	

	}

}
