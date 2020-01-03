package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
	[문제3] 로또 
	크기가 6개인 정수형 배열을 잡아서 1~45사이의 난수를 발생하여 저장 후 출력하시오
	단, 숫자가 중복되면 안된다
	
	input() - 난수 발생, 중복된 숫자가 나오면 다시 발생
	output() - 출력
 */
public class Practice3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lotto[] = new int[6];
		int money;
		
		System.out.println("현금입력 : ");
		money = Integer.parseInt(br.readLine());
		Practice3 p3 = new Practice3();
		
		for(int i=1; i<=money/1000; i++) {
				
		p3.input(lotto);
		//Arrays.sort(lotto);//오름차순
		p3.sort(lotto);
		p3.output(lotto);
		if(i%5==0)System.out.println();
		}
	}
	 
	private void sort(int[] lotto) {//sort 프로그램
		for(int i=0; i<lotto.length-1; i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i] > lotto[j]) {//부등호 방향만 바꾸면 오름,내림 차순 변경
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;					
				}				
			}
		}
		
	}

	public void input(int[] lotto) {
		System.out.print ("로또 번호  : ");
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;

			//중복체크
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) { 
					i--; break;
				}
			}
		}//for i
		
	}
	public void output(int[] lotto) {
		for(int n : lotto)System.out.print(String.format("%5d", n)); 
			System.out.println(" 입니다");
		}
}
