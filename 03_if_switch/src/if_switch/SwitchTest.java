package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("월을 입력하세요 : ");
		int month = Integer.parseInt(br.readLine());
		int days=0;
		
		switch(month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10	:	
		case 12 : days=31; break;
		case 2 : days=28; break;
		case 4 : 
		case 6 : 
		case 9 : 
		case 11 : days=30; break;
		default : System.out.println("잘못입력 함");
		}
		System.out.println(month+"월은"+days+"일 입니다.");
	}

}
