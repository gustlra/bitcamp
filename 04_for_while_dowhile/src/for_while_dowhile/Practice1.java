package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
	[����4] ���� ����
	10~99 ������ ������ 2��(a,b) �߻��Ͽ� ���� ���ߴ� ����
	�������� �� 5������ �����Ѵ�
	1������ ���� 20���� ���
	���� Ʋ���� ��ȸ�� 1�� �� �����Ѵ�
	
	[������]
	[1] 25 + 36 = 45
	Ʋ�ȴ�
	[1] 25 + 36 = 61
	������
	
	[2] 78 + 10 = 100
	Ʋ�ȴ�
	[2] 78 + 10 = 95
	Ʋ�ȴ�...���� :
	...
	
	����� �� x������ ���߾ xx�� �Դϴ�
	
	continue(y/n) : w
	continue(y/n) : n
	���α׷��� �����մϴ�
*/
public class Practice1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int a, b, sum, count;
		String yn;
		
		while(true) {
			count=0;
			for(int i=1; i<=5; i++) {
				a = (int) (Math.random() * 90)+10;//10~99
				b = (int) (Math.random() * 90)+10;//10~99
				
				for(int j=1; j<=2; j++) {//j�ι���
					System.out.print("["+i+"]"+a+" + " +b+ " = ");
					sum = Integer.parseInt(br.readLine());
					
					if(sum == a+b) {
						System.out.println("�����Դϴ�.");
						count++;
						break; //for j�� �����
					}else{
						if(j==2) System.out.println("Ʋ�ȴ�..������"+(a+b));
						else System.out.println("Ʋ�Ǵ�");
					}
				}//for j
			}//for i
			System.out.println("����� �� " + count + "������ ���缭"+count*20+"�� �Դϴ�.");
			
			System.out.println();
			do {
				System.out.print("continue(Y/N) : ");
				yn = br.readLine();
			}while(!yn.equals("Y")&&!yn.equals("y")&&!yn.equals("N")&&!yn.equals("n"));
			if(yn.equals("N") || yn.contentEquals("n")) break;
		}//while
		
		System.out.println("���α׷��� �����մϴ�");
	}		
	
}

