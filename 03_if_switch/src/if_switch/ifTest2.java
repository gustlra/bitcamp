package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*	
	3개의 숫자(a,b,c)를 입력받아서 순서대로 출겹하시오
	
	[실행결과]
	a값 입력 : 78
	b값 입력 : 25
	c값 입력 : 36
	25 36 78
*/
public class ifTest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("a값 입력 :");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("b값 입력 : ");
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("c값 입력 : ");
		int c = Integer.parseInt(br.readLine());
		
		
		if(a<=b && a<=c) {
			if(b<=c)System.out.println(a+" , "+b+" , "+c);
			else System.out.println(a+" , "+c+" , "+b);
			
		}else if (b<=c) {
			if(a<=c)System.out.println(b+" , "+a+" , "+b);
			else System.out.println(b+" , "+c+" , "+a);
		}else {
			if(a<=b)System.out.println(c+" , "+a+" , "+b);
			else System.out.println(c+" , "+b+" , "+a);
		}
		
		/*	if(a<b&&b<c) {

				System.out.println("결과:"+a+" "+b+" "+c);
	
			} else if(a<c&&c<b) {
	
				System.out.println("결과:"+a+" "+c+" "+b);
	
			} else if(b<a&&a<c) {
	
				System.out.println("결과:"+b+" "+a+" "+c);
	
			} else if(b<c&&c<a) {
	
				System.out.println("결과:"+b+" "+c+" "+a);
	
			} else if(c<a&&a<b) {
	
				System.out.println("결과:"+c+" "+a+" "+b);
	
			} else if(c<b&&b<a) {
	
				System.out.println("결과:"+c+" "+b+" "+a);
	
			} else
	
				System.out.println("세 숫자 중 2개이상이 같음");
		 */
	
	}
}
