package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/*
	a값 입력 : 25 
	b값 입력 : 36
	연산자(+,-,*,/) 입력 : +
	25+36=xx
	
	a값 입력 : 25 
	b값 입력 : 36
	연산자(+,-,*,/) 입력 : /
	25/36=xx.xxx
	
	a값 입력 : 25 
	b값 입력 : 36
	연산자(+,-,*,/) 입력 : $
	연산자 error
 */

public class SwitchTest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("a값 입력 : ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("b값 입력 : ");
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("연산자 (+, -, *, /) 입력 : ");
		String c = br.readLine();
		
		switch(c) {
		case "+" : System.out.println(a+b); break;
		case "-" : System.out.println(a-b); break;
		case "*" : System.out.println(a*b); break;
		case "/" : 
			//System.out.println(String.format("%.2f",(double)a/b));
			DecimalFormat df = new DecimalFormat("#.###");//패턴지정 #으로 표기
			System.out.println(df.format((double)a/b));
			break;
		default : System.out.println("연산자 error");
		}		

	}

}
