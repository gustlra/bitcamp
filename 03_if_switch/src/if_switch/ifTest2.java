package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*	
	3���� ����(a,b,c)�� �Է¹޾Ƽ� ������� ����Ͻÿ�
	
	[������]
	a�� �Է� : 78
	b�� �Է� : 25
	c�� �Է� : 36
	25 36 78
*/
public class ifTest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("a�� �Է� :");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("b�� �Է� : ");
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("c�� �Է� : ");
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

				System.out.println("���:"+a+" "+b+" "+c);
	
			} else if(a<c&&c<b) {
	
				System.out.println("���:"+a+" "+c+" "+b);
	
			} else if(b<a&&a<c) {
	
				System.out.println("���:"+b+" "+a+" "+c);
	
			} else if(b<c&&c<a) {
	
				System.out.println("���:"+b+" "+c+" "+a);
	
			} else if(c<a&&a<b) {
	
				System.out.println("���:"+c+" "+a+" "+b);
	
			} else if(c<b&&b<a) {
	
				System.out.println("���:"+c+" "+b+" "+a);
	
			} else
	
				System.out.println("�� ���� �� 2���̻��� ����");
		 */
	
	}
}
