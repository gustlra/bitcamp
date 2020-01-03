package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/*
 * [문제5] 성적 관리 프로그램
	중간고사, 기말고사, 레포트, 출석점수를 입력받아서 계산하시오
	
	조건1) (중간+기말)/2    ---> 60%
	          과제   	     ---> 20%
	          출석                ---> 20%     
	조건2)  90이상 'A'학점     		
	          80이상 'B'학점        		  	 
	          70이상 'C'학점        		  	 
	          60이상 'D'학점        		  	 
	          나머지 'F'학점
	조건3)
	         A, B학점  ---->"excellent"     
	         C, D학점  ---->"good"
	         F학점    ---->"poor"
	
	[실행결과]
	중간고사를 입력하시오 : 90
	기말고사를 입력하시오 : 89
	과제점수를 입력하시오 : 99
	출석점수를 입력하시오 : 100
	
	성적=96.20         <---소수이하 2째자리까지
	학점=A              
	평가=excellent
*/
public class Practice2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int a, b, c, d;//a=중간고사,b=기말고사,c=과제점수,d=출석점수
		System.out.println("중간고사를 입력하시오 : ");
		a = Integer.parseInt(br.readLine());
		System.out.println("기말고사를 입력하시오 : ");
		b = Integer.parseInt(br.readLine());
		System.out.println("과제점수를 입력하시오 : ");
		c = Integer.parseInt(br.readLine());
		System.out.println("출석점수를 입력하시오 : ");
		d = Integer.parseInt(br.readLine());
		
		//tot=총점
		double tot = ((a+b)/2)*0.6+(c*0.2)+(d*0.2);
		
		System.out.println(String.format("%.2f", tot));
		
		 
		if(tot>=90) {
			System.out.println("학점 = A");
		}else if(tot>=80) {
			System.out.println("학점 = B");
		}else if(tot>=70) {
			System.out.println("학점 = C");
		}else if(tot>=60) {
			System.out.println("학점 = D");
		}else {
			System.out.println("학점 = F");
		}
		
		if(tot>=80) {
			System.out.println("평가 : excellent");
		}else if(tot>=60) {
			System.out.println("평가 : good");
		}else {
			System.out.println("poor");
		}
		
		
		
		
		
	
	}

}
