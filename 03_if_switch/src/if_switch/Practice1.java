package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
	[문제1] 가위바위보 게임 - if문

	[실행결과]
	가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
	컴퓨터 : 바위	나 : 보자기
	You Win!!
	또 할래(Y/N) : y
	
	가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
	컴퓨터 : 가위	나 : 보자기
	You Lose!!
	또 할래(Y/N) : y
	
	가위(1),바위(2),보(3) 중 번호 입력 : 2 (user)
	컴퓨터 : 가위	나 : 가위
	You Draw!!
	또 할래(Y/N) : n
	프로그램을 종료합니다
	
 */

public class Practice1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			int num = (int)(Math.random()*3+1);
			System.out.println(num);
			
			System.out.print("가위(1), 바위(2), 보(3) : ");
			int user;
			user = Integer.parseInt(br.readLine()); 
			
			System.out.print("컴퓨터 : ");
			if(num == 1) {
				System.out.print("가위  ");			
			}else if(num == 2){
				System.out.print("바위  ");
			}else{
				System.out.print("보  ");
			}
			
			System.out.print("나 : ");
			if(user == 1) {
				System.out.println("가위");
			}else if(user == 2 ) {
				System.out.println("바위");
			}else {
				System.out.println("보");
			}
			
			//가위 보, 바위 가위, 보  바위
			//가위 바위, 바위 보, 보 가위
			//
			if(user == num) {
				System.out.println("You Draw!");
			}else if((user == 1 && num == 3) || (user == 2 && num == 1) || (user == 3 && num == 2)) {
				System.out.println("You Win!");
			}else {
				System.out.println("You Lose!");
			}
			System.out.println("또할래?");
			String n = br.readLine();//String은 == X / String 은 ?.equals로 사용
			
			if(n.equals("n")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	
	}
}
