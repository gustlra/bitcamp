package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("���ڿ� �Է����ּ��� : ");
		String str = br.readLine();//redLine ���ٴ����� �о��
		
		System.out.println("���� �Է����ּ��� : ");
		int aa = Integer.parseInt(br.readLine());
		
		System.out.println("�Ǽ� �Է����ּ��� : ");
		double bb = Double.parseDouble(br.readLine());
		
		System.out.println(str+"\t"+aa+"\t"+bb);
	}

}

/*exception(����ó��)
1. ������
2. ����
*/
