package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	[����4] �߱�����
	ũ�Ⱑ 3���� ������ �迭�� ��� 1~9������ ������ �߻��Ѵ�
	�߻��� ���� ���ߴ� ����
	�ߺ��� �����Ѵ�
	
	[������]
	������ �����Ͻðڽ��ϱ�(Y/N) : w
	������ �����Ͻðڽ��ϱ�(Y/N) : u
	������ �����Ͻðڽ��ϱ�(Y/N) : y
	
	������ �����մϴ�
	
	�����Է� : 123
	0��Ʈ����ũ 0��
	
	�����Է� : 567
	0��Ʈ����ũ 2��
	
	�����Է� : 758
	1��Ʈ����ũ 2��
	...
	
	�����Է� : 785
	3��Ʈ����ũ 0��
	
	��ǻ�� : com
	����� : user
*/

public class Practice4 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int com[] = new int[3];
		int user[] = new int[3];
		String yn;
		String inputStr;
		int strike, ball;
		
		do {
			System.out.println("������ �����Ͻðڽ��ϱ�(Y/N) : ");
			yn = br.readLine();
		}while(!yn.equals("Y") && !yn.equals("y") && !yn.equals("N") && !yn.equals("n"));
		
		System.out.println();		
		System.out.println("������ �����մϴ�");
		
		if(yn.equals("Y") || yn.equals("y")) {
		//�����߻�
			for(int i=0; i<com.length; i++) {
				com[i] = (int)(Math.random()*9)+1;
			
				//�ߺ�üũ
				for(int j=0; j<i; j++) {
					if(com[i] == com[j]) {
						i--;
						break;
					}
				}
			}
			while(true)//�Է�
			{
				System.out.println();
				System.out.print("���� �Է� : ");
				inputStr = (br.readLine());
		
				for(int i=0; i<user.length; i++) {
					user[i] = inputStr.charAt(i)-48;
				}
				
				//��
				strike = ball = 0;
				for(int i=0; i<com.length; i++) {
					for(int j=0; j<user.length; j++) {
						if(com[i] == user[j]) {
							if(i == j) strike++;
							else ball++;
							
						}
					}
				}
				//for i
				System.out.println(strike+"��Ʈ����ũ"+ball+"��");
				if(strike==3) break;
			}
			
		}
		System.out.println("���α׷��� �����մϴ�");

	}

}
