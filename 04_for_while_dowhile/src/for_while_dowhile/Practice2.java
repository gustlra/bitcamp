package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/*
 * [����5] ���� ���� ���α׷�
	�߰����, �⸻���, ����Ʈ, �⼮������ �Է¹޾Ƽ� ����Ͻÿ�
	
	����1) (�߰�+�⸻)/2    ---> 60%
	          ����   	     ---> 20%
	          �⼮                ---> 20%     
	����2)  90�̻� 'A'����     		
	          80�̻� 'B'����        		  	 
	          70�̻� 'C'����        		  	 
	          60�̻� 'D'����        		  	 
	          ������ 'F'����
	����3)
	         A, B����  ---->"excellent"     
	         C, D����  ---->"good"
	         F����    ---->"poor"
	
	[������]
	�߰���縦 �Է��Ͻÿ� : 90
	�⸻��縦 �Է��Ͻÿ� : 89
	���������� �Է��Ͻÿ� : 99
	�⼮������ �Է��Ͻÿ� : 100
	
	����=96.20         <---�Ҽ����� 2°�ڸ�����
	����=A              
	��=excellent
*/
public class Practice2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int a, b, c, d;//a=�߰����,b=�⸻���,c=��������,d=�⼮����
		System.out.println("�߰���縦 �Է��Ͻÿ� : ");
		a = Integer.parseInt(br.readLine());
		System.out.println("�⸻��縦 �Է��Ͻÿ� : ");
		b = Integer.parseInt(br.readLine());
		System.out.println("���������� �Է��Ͻÿ� : ");
		c = Integer.parseInt(br.readLine());
		System.out.println("�⼮������ �Է��Ͻÿ� : ");
		d = Integer.parseInt(br.readLine());
		
		//tot=����
		double tot = ((a+b)/2)*0.6+(c*0.2)+(d*0.2);
		
		System.out.println(String.format("%.2f", tot));
		
		 
		if(tot>=90) {
			System.out.println("���� = A");
		}else if(tot>=80) {
			System.out.println("���� = B");
		}else if(tot>=70) {
			System.out.println("���� = C");
		}else if(tot>=60) {
			System.out.println("���� = D");
		}else {
			System.out.println("���� = F");
		}
		
		if(tot>=80) {
			System.out.println("�� : excellent");
		}else if(tot>=60) {
			System.out.println("�� : good");
		}else {
			System.out.println("poor");
		}
		
		
		
		
		
	
	}

}
