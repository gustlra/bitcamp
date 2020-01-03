package for_while_dowhile;
/*
 * [문제8] 계좌관리 프로그램
	예금, 출금, 잔고, 종료 기능을 제공하는 간단 계좌관리 프로그램을 작성하시오.
	조건) 예금은 input(), 출금은 output()에서 처리하세요
	
	[실행결과]
	****************
	   1. 예금
	   2. 출금
	   3. 잔고
	   4. 종료
	****************
	번호 선택 : 1
	예금액 : 10000
	당신의 잔액은 10000원 입니다
	또는
	예금액 : 12000
	만원 단위로 입력하세요
	
	****************
	   1. 예금
	   2. 출금
	   3. 잔고
	   4. 종료
	****************
	번호 선택 : 2
	출금액 : 8000
	당신의 잔액은 2000원 입니다
	또는 
	출금액 : 18000
	잔액이 부족합니다
	
	1. 예금 2. 출금 3. 잔고 4. 종료
	번호 선택 : 3
	당신의 잔액은 2000원 입니다
	
	1. 예금 2. 출금 3. 잔고 4. 종료
	번호 선택 : 4
	프로그램을 종료합니다.
 */



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;



public class Practice5 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Practice5 p5 = new Practice5();
		
		int num;
		int balance=0;//잔액
		int deposit;
		
		while(true) {
			System.out.println();
			System.out.println("****************");
			System.out.println(" 1. 예금");
			System.out.println(" 2. 출금");
			System.out.println(" 3. 잔고");
			System.out.println(" 4. 종료");
			System.out.println("****************");
			System.out.print("번호 선택 : ");
			num = Integer.parseInt(br.readLine());
			if(num==4) break;		
			if(num==1) balance = p5.input(balance);
			else if(num==2) balance = p5.output(balance);
			else if(num==3)
				System.out.println("당신의 잔액은 " + balance + "원 입니다.");;
		}//while
		System.out.println("프로그램을 종료합니다");
		
		
	}
 
	private int output(int balance) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int deposit;
		
		System.out.println("출금액 : ");
		deposit = Integer.parseInt(br.readLine());
		
		if(balance >= deposit) {
			balance -= deposit;
			System.out.println("당신의 잔액은 " + balance + "원 입니다.");
		}else
			System.out.println("잔액이 부족합니다.");
		return balance;
	} 

	private static int input(int balance) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("예금액 : ");
		int deposit = Integer.parseInt(br.readLine());
		
		if(deposit%10000==0) {
			balance += deposit;
			System.out.println("당신의 잔액은 " + balance + "원 입니다.");;
		}else
			System.out.println("만원 단위로");
		return balance;
	}
}

