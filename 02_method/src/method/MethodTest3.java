package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest3 {

	public static void main(String[] args) throws IOException {
		//이름, 국어, 영어, 수학을 입력 받아서 총점, 평균을 구하시오.
		//총점 calcTot()구해오기
		//평균calcAvg()구해오기
		//실행결과 - 이름, 90, 85, 100, ???,  ??.??
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		System.out.println("이름 입력 : ");
		String name = br.readLine();
		
		System.out.println("국어 입력 : ");
		int kor = Integer.parseInt(br.readLine());
		
		System.out.println("영어 입력 : ");
		int eng = Integer.parseInt(br.readLine());
		
		System.out.println("수학 입력 : ");
		int math = Integer.parseInt(br.readLine());
		
		MethodTest3 mt = new MethodTest3();
		int tot = mt.calTot(kor, eng, math);
		double avg = mt.calAvg(tot);
		
		System.out.println("***" +name+ "성적표 ***");
		System.out.println("이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
		System.out.println(name+ "\t" +kor+ "\t" +eng+ "\t" +math+ "\t" +tot+ "\t" +String.format("%.2f",avg));
	}//main
	
		public int calTot(int kor, int eng, int math) {
			return kor+eng+math;
		}//calTot
		
		public double calAvg(int tot) {
			return tot/3.0;
		}
	

}
/*
이름 입력 : 홍길동
국어 입력 : 92
영어 입력 : 100
수학입력 : 85
*/