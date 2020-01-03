package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	[����2]
	10������ �Է��Ͽ� 2������ ��ȯ�Ͻÿ�
	0�� �ԷµǸ� ���α׷��� �����ϼ���
	������ �ԷµǸ� ���Է��ϼ���
	4���� ��� �����ֱ�
	Integer.toBinaryString() ��������
	
	[������]
	10���� �Է� : -5
	
	10���� �Է� : 250
	1111 1010 
	
	10���� �Է� : 12
	1100
	
	10���� �Է� : 0
	���α׷��� ����
 */
public class Practice2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] binary = new int[32];
		int dec;
		
		while(true) {
			System.out.println("10���� �Է� : ");
			dec = Integer.parseInt(br.readLine());
			if(dec==0) break;
			if(dec<0) continue;
			int i;
			for( i=0; dec!=0; i++) {
				binary[i] = dec%2;
				dec = dec/2;
			}//for
			 
			
			for(int j=i-1; j>=0; j--) {
				System.out.print(binary[j]);
				if(j%4==0) System.out.println(" ");
				
			}
			System.out.println();
		}//while
		System.out.println("���α׷��� �����մϴ�.");
		
		
/*		int[] s = new int[32];
		System.out.println("10���� �Է� : ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println();
		 
		for(int i=0; i<s.length; i++) {
			s[i] = a%2;
			a=a/2;
		}
		for(int i=s.length-1; i>= 0; i--) {
			System.out.print(s[i]);
		} 
*/
		
		

	}

}
