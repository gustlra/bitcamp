package for_while_dowhile;
/*
	[문제6]
	문제5번에서 조건2, 조건3의 if문으로 처리한 것을 switch로 바꾸시오
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mScore, lScore, homeWork, attendance;
		
		System.out.print("중간고사를 입력하시오 : ");
		mScore = Integer.parseInt(br.readLine());
		System.out.print("기말고사를 입력하시오 : ");
		lScore = Integer.parseInt(br.readLine());
		System.out.print("과제점수를 입력하시오 : ");
		homeWork = Integer.parseInt(br.readLine());
		System.out.print("출석점수를 입력하시오 : ");
		attendance = Integer.parseInt(br.readLine());
		double score = ((mScore+lScore)/2*0.6) + (homeWork*0.2) + (attendance*0.2);
		int score2 = (int)score/10;
		char grade;
		String value;
		
		switch(score2) {
		case 10:
		case 9: grade='A'; break;
		case 8: grade='B'; break;
		case 7: grade='C'; break;
		case 6: grade='D'; break;
		default: grade='F'; 
		}
		
		switch(grade) {
		case 'A': 
		case 'B': value="excellent";break;
		case 'C': 
		case 'D': value="good";break;
		default: value="poor";
		}
	
		System.out.println("성적="+String.format("%.2f", score));
		System.out.println("학점="+grade);
		System.out.println("평가="+value);

	}

}
