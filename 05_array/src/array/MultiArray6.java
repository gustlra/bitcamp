package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class MultiArray6 {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			//학생수 입력
			System.out.print("학생수를 입력하시오");
			int cnt = Integer.parseInt(br.readLine());
			
			//학생수 만큼 배열 
			String name[] = new String[cnt];
			String subject[][]= new String[cnt][];
			int jumsu[][] = new int[cnt][];
			double[] avg = new double[cnt];
			DecimalFormat df = new DecimalFormat();
			int subjectCnt;
			
			for(int i=0; i<cnt; i++) {
				System.out.print("이름 : ");
				name[i] = br.readLine();
				
				//과목수	
				System.out.println("과목수를 입력하시오.");
				subjectCnt = Integer.parseInt(br.readLine());
				subject[i] = new String[subjectCnt];
				for(int j=0; j<subjectCnt; j++) {
					System.out.println("과목명 : ");
					subject[i][j] = br.readLine();
				}//for j
				
				jumsu[i] = new int[subjectCnt+1];
				for(int j=0; j<subjectCnt; j++) {
					System.out.println(subject[i][j] + "점수입력");
					jumsu[i][j] = Integer.parseInt(br.readLine());
				
				
				//총점
				jumsu[i][subjectCnt] += jumsu[i][j];
				}//for j
				
				//평균
				avg[i] = (double)jumsu[i][subjectCnt] / subjectCnt;
				
				System.out.println("");
					
			}//for i
			for(int i=0; i<cnt; i++) {
				System.out.println("이름\t");
				for(int j=0; j<subject[i].length; j++) {
					System.out.println(subject[i][j] + "\t");
				}
				System.out.println("총점\t평균");
				
				System.out.println(name[i] + "\t");
				for(int j=0; j<jumsu[i].length; j++) {
					System.out.println(jumsu[i][j] + "\t");
				}
				System.out.println(df.format(avg[i]));
				System.out.println();
			}

			
/*
			int cnt;
			double avg = 0;
			int subjectCnt;
			int[] jumsu = null;
			
			System.out.println("학생수를 입력하시오");
			cnt = Integer.parseInt(br.readLine());
			String[] name = new String[cnt];
			for(int i=0; i<name.length; i++) {
				System.out.println("이름입력 : ");
					name[i] = br.readLine();
			}
			System.out.println("과목수 입력 : ");
			subjectCnt = Integer.parseInt(br.readLine());
			String subject[] = new String[subjectCnt];
			for(int i=0; i<subject.length; i++) {
				System.out.println("과목명 입력 : ");
				subject[i] = br.readLine();
				}
				for(int j=0; j<subject.length; j++) {
				System.out.println(subject[j]+"점수 입력 : ");
				jumsu = new int[subjectCnt];
				jumsu[j] = Integer.parseInt(br.readLine());
							
				
			}System.out.println(name[0]+"\t"+subject[0]);
		
		
*/		
		}
}
/*
	인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
	평균은 소수이하 두번째 자리까지
	
	[실행결과]
	인원수 : 2(cnt)
	
	이름입력 : 홍길동(name)
	과목수 입력 : 2(subjectCnt)
	과목명 입력 : 국어(subject)
	과목명 입력 : 영어(
	
	국어 점수  입력 : 95(jumsu)
	영어 점수 입력 : 100
	
	이름 국어 영어 총점 평균
	
	이름 국어 영어 과학 총점 평균
*/
