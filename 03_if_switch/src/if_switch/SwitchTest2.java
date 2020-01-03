package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/*
	a�� �Է� : 25 
	b�� �Է� : 36
	������(+,-,*,/) �Է� : +
	25+36=xx
	
	a�� �Է� : 25 
	b�� �Է� : 36
	������(+,-,*,/) �Է� : /
	25/36=xx.xxx
	
	a�� �Է� : 25 
	b�� �Է� : 36
	������(+,-,*,/) �Է� : $
	������ error
 */

public class SwitchTest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("a�� �Է� : ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("b�� �Է� : ");
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("������ (+, -, *, /) �Է� : ");
		String c = br.readLine();
		
		switch(c) {
		case "+" : System.out.println(a+b); break;
		case "-" : System.out.println(a-b); break;
		case "*" : System.out.println(a*b); break;
		case "/" : 
			//System.out.println(String.format("%.2f",(double)a/b));
			DecimalFormat df = new DecimalFormat("#.###");//�������� #���� ǥ��
			System.out.println(df.format((double)a/b));
			break;
		default : System.out.println("������ error");
		}		

	}

}
