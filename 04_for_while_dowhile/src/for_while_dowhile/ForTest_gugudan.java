package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest_gugudan {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dan, i;
		
		System.out.println("���ϴ� ���� �Է��ϼ��� : ");
		dan = Integer.parseInt(br.readLine());
		
			
		for(i = 1; i<10; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		

	}

}
