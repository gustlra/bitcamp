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
		
		while(true) {
			System.out.println("������ �����Ͻðڽ��ϱ�(Y/N) : ");
			String choice = br.readLine();
			if(choice.equals("Y") || choice.equals("y")) {
				System.out.println("������ �����մϴ�");
				for()
				com[] = (int)(Math.random()*9)+1;		
				System.out.println("���� �Է� : ");
				int user = Integer.parseInt(br.readLine()); 
				
			}else if(choice.equals("N") || choice.equals("n")) {
				System.out.println("���α׷� ����");break;
			}else {
				
			}
		}	

	}

}
