package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
	[����1] ���������� ���� - if��

	[������]
	����(1),����(2),��(3) �� ��ȣ �Է� : 3 (user)
	��ǻ�� : ����	�� : ���ڱ�
	You Win!!
	�� �ҷ�(Y/N) : y
	
	����(1),����(2),��(3) �� ��ȣ �Է� : 3 (user)
	��ǻ�� : ����	�� : ���ڱ�
	You Lose!!
	�� �ҷ�(Y/N) : y
	
	����(1),����(2),��(3) �� ��ȣ �Է� : 2 (user)
	��ǻ�� : ����	�� : ����
	You Draw!!
	�� �ҷ�(Y/N) : n
	���α׷��� �����մϴ�
	
 */

public class Practice1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			int num = (int)(Math.random()*3+1);
			System.out.println(num);
			
			System.out.print("����(1), ����(2), ��(3) : ");
			int user;
			user = Integer.parseInt(br.readLine()); 
			
			System.out.print("��ǻ�� : ");
			if(num == 1) {
				System.out.print("����  ");			
			}else if(num == 2){
				System.out.print("����  ");
			}else{
				System.out.print("��  ");
			}
			
			System.out.print("�� : ");
			if(user == 1) {
				System.out.println("����");
			}else if(user == 2 ) {
				System.out.println("����");
			}else {
				System.out.println("��");
			}
			
			//���� ��, ���� ����, ��  ����
			//���� ����, ���� ��, �� ����
			//
			if(user == num) {
				System.out.println("You Draw!");
			}else if((user == 1 && num == 3) || (user == 2 && num == 1) || (user == 3 && num == 2)) {
				System.out.println("You Win!");
			}else {
				System.out.println("You Lose!");
			}
			System.out.println("���ҷ�?");
			String n = br.readLine();//String�� == X / String �� ?.equals�� ���
			
			if(n.equals("n")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
	
	}
}
