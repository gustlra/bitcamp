package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("문자열 입력해주세요 : ");
		String str = br.readLine();//redLine 한줄단위로 읽어라
		
		System.out.println("정수 입력해주세요 : ");
		int aa = Integer.parseInt(br.readLine());
		
		System.out.println("실수 입력해주세요 : ");
		double bb = Double.parseDouble(br.readLine());
		
		System.out.println(str+"\t"+aa+"\t"+bb);
	}

}

/*exception(예외처리)
1. 컴파일
2. 실행
*/
