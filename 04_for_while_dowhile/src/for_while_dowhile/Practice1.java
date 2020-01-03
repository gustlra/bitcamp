package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
	[문제4] 덧셈 공부
	10~99 사이의 난수를 2개(a,b) 발생하여 합을 맞추는 게임
	문제수는 총 5문제를 제공한다
	1문제당 점수 20점씩 계산
	만약 틀리면 기회를 1번 더 제공한다
	
	[실행결과]
	[1] 25 + 36 = 45
	틀렸다
	[1] 25 + 36 = 61
	딩동뎅
	
	[2] 78 + 10 = 100
	틀렸다
	[2] 78 + 10 = 95
	틀렸다...정답 :
	...
	
	당신의 총 x문제를 맞추어서 xx점 입니다
	
	continue(y/n) : w
	continue(y/n) : n
	프로그램을 종료합니다
*/
public class Practice1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int a, b, sum, count;
		String yn;
		
		while(true) {
			count=0;
			for(int i=1; i<=5; i++) {
				a = (int) (Math.random() * 90)+10;//10~99
				b = (int) (Math.random() * 90)+10;//10~99
				
				for(int j=1; j<=2; j++) {//j두번돔
					System.out.print("["+i+"]"+a+" + " +b+ " = ");
					sum = Integer.parseInt(br.readLine());
					
					if(sum == a+b) {
						System.out.println("정답입니다.");
						count++;
						break; //for j를 벗어나라
					}else{
						if(j==2) System.out.println("틀렸다..정답은"+(a+b));
						else System.out.println("틀렷다");
					}
				}//for j
			}//for i
			System.out.println("당신은 총 " + count + "문제를 맞춰서"+count*20+"점 입니다.");
			
			System.out.println();
			do {
				System.out.print("continue(Y/N) : ");
				yn = br.readLine();
			}while(!yn.equals("Y")&&!yn.equals("y")&&!yn.equals("N")&&!yn.equals("n"));
			if(yn.equals("N") || yn.contentEquals("n")) break;
		}//while
		
		System.out.println("프로그램을 종료합니다");
	}		
	
}

