package array;
/*
	------------------------
 */
public class MultiArray4 {

	public static void main(String[] args) {
		String[] name = {"홍길동","코난","또치"};
		int[][] jumsu = {{90,95,100,0},{100,89,75,0},{75,80,48,0}};
		double avg=0;
		String grade;
		
		System.out.println("----------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("----------------------------------------------------");		
		for(int i=0; i<jumsu.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<jumsu.length; j++) {				
				System.out.print(String.format("%2d",jumsu[i][j])+"\t");
				jumsu[i][3] += jumsu[i][j];
				
			} avg = (double)jumsu[i][3]/3;
			System.out.print(jumsu[i][3]+"\t");
			System.out.print(String.format("%.2f", (avg))+"\t");
			if(avg>90) {
				grade = "A";
			}else if(avg>80) {
				grade = "B";
			}else if(avg>70) {
				grade = "C";
			}else {
				grade = "D";
			}System.out.println(grade);
					
		}System.out.println("----------------------------------------------------");
		
	
		
		

//		int[][] score = {{100,100,100},{20,20,20},{30,30,30},{40,40,40},{50,50,50}};
//		System.out.println("번호\t 국어\t 영어\t 수학\t 총점\t 평균");
//		System.out.println("=============================================");
//		int sum=0;
//			for(int i=0;i<5;i++) {
//				System.out.print(i+1+"\t");
//				for(int j=0; j<3;j++) {
//					System.out.print(score[i][j]+"\t");
//					sum=score[i][0]+score[i][1]+score[i][2];
//				}
//		// subsum=score[i][0];
//				System.out.print(sum+"\t");
//				System.out.print(sum/3);
//				System.out.println();
//		}
//		System.out.println("=============================================");
	}

}
