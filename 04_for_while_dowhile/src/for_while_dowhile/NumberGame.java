package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	���ڸ��߱� ����
	1~100 ������ ������ �߻��Ͽ� ���ߴ� ����
	[������]
	���� �Է� : 50
	50���� Ů�ϴ�
	
	���� �Է� :
	50���� �۽��ϴ�.
	
	���� �Է� : 87
	������ xx������ ���߼̽��ϴ�.

*/

public class NumberGame {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int com, user, count;
		String yn;
		do {
			count = 0;
			com = (int)(Math.random()*100)+1;//1~100���� ����
			while(true) {
				System.out.print("���� �Է� : ");
				user = Integer.parseInt(br.readLine());
				count++;
				 
				if(com==user) break; 
				if(com > user) {
					System.out.print(user + "���� Ů�ϴ�");
				}else {
					System.out.print(user + "���� �۽��ϴ�");
				}
				System.out.println();
			}//while
		
			System.out.println("������" +count+ "������ ���߼̽��ϴ�");
			System.out.println();
			
			System.out.println("\n ���ҷ�?(Y/N) : ");
			yn = br.readLine();//String�� == X / String �� ?.equals�� ���
			
			if(yn.equals("n") || yn.equals("N")) break;
			
		}while(true);
				
		System.out.println("���α׷��� �����մϴ�.");
			
	}
}



