package instance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	[문제3]
	초를 입력받아서 time()에서 시,분,초를 구하여 출력한다
	
	[실행결과]
	초를 입력하시오 : 3850
	1시간 4분 10초 입니다
 
 */

public class Practice10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Practice10 p10 = new Practice10();
		System.out.println("초를 입력하시오 : ");
		int second = Integer.parseInt(br.readLine());
		p10.time(second);
		System.out.println("프로그램을 종료합니다.");
		
		
	}

	public void time(int second) {
		int hour = second / 3600; //1시간 = 3600초
		int minute = second % 3600 / 60; //1분 = 60초
		int sec = second % 3600 % 60;
		System.out.println(hour +"시간"+minute+"분"+sec+"초 입니다");
		// TODO Auto-generated method stub
		
	}

}
