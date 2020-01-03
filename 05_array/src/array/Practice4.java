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
		String yn;
		String inputStr;
		int strike, ball;
		
		do {
			System.out.println("게임을 실행하시겠습니까(Y/N) : ");
			yn = br.readLine();
		}while(!yn.equals("Y") && !yn.equals("y") && !yn.equals("N") && !yn.equals("n"));
		
		System.out.println();		
		System.out.println("게임을 시작합니다");
		
		if(yn.equals("Y") || yn.equals("y")) {
		//난수발생
			for(int i=0; i<com.length; i++) {
				com[i] = (int)(Math.random()*9)+1;
			
				//중복체크
				for(int j=0; j<i; j++) {
					if(com[i] == com[j]) {
						i--;
						break;
					}
				}
			}
			while(true)//입력
			{
				System.out.println();
				System.out.print("숫자 입력 : ");
				inputStr = (br.readLine());
		
				for(int i=0; i<user.length; i++) {
					user[i] = inputStr.charAt(i)-48;
				}
				
				//비교
				strike = ball = 0;
				for(int i=0; i<com.length; i++) {
					for(int j=0; j<user.length; j++) {
						if(com[i] == user[j]) {
							if(i == j) strike++;
							else ball++;
							
						}
					}
				}
				//for i
				System.out.println(strike+"스트라이크"+ball+"볼");
				if(strike==3) break;
			}
			
		}
		System.out.println("프로그램을 종료합니다");

	}

}
