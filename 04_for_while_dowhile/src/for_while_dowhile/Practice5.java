package for_while_dowhile;
/*
 * [����8] ���°��� ���α׷�
	����, ���, �ܰ�, ���� ����� �����ϴ� ���� ���°��� ���α׷��� �ۼ��Ͻÿ�.
	����) ������ input(), ����� output()���� ó���ϼ���
	
	[������]
	****************
	   1. ����
	   2. ���
	   3. �ܰ�
	   4. ����
	****************
	��ȣ ���� : 1
	���ݾ� : 10000
	����� �ܾ��� 10000�� �Դϴ�
	�Ǵ�
	���ݾ� : 12000
	���� ������ �Է��ϼ���
	
	****************
	   1. ����
	   2. ���
	   3. �ܰ�
	   4. ����
	****************
	��ȣ ���� : 2
	��ݾ� : 8000
	����� �ܾ��� 2000�� �Դϴ�
	�Ǵ� 
	��ݾ� : 18000
	�ܾ��� �����մϴ�
	
	1. ���� 2. ��� 3. �ܰ� 4. ����
	��ȣ ���� : 3
	����� �ܾ��� 2000�� �Դϴ�
	
	1. ���� 2. ��� 3. �ܰ� 4. ����
	��ȣ ���� : 4
	���α׷��� �����մϴ�.
 */



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;



public class Practice5 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Practice5 p5 = new Practice5();
		
		int num;
		int balance=0;//�ܾ�
		int deposit;
		
		while(true) {
			System.out.println();
			System.out.println("****************");
			System.out.println(" 1. ����");
			System.out.println(" 2. ���");
			System.out.println(" 3. �ܰ�");
			System.out.println(" 4. ����");
			System.out.println("****************");
			System.out.print("��ȣ ���� : ");
			num = Integer.parseInt(br.readLine());
			if(num==4) break;		
			if(num==1) balance = p5.input(balance);
			else if(num==2) balance = p5.output(balance);
			else if(num==3)
				System.out.println("����� �ܾ��� " + balance + "�� �Դϴ�.");;
		}//while
		System.out.println("���α׷��� �����մϴ�");
		
		
	}
 
	private int output(int balance) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int deposit;
		
		System.out.println("��ݾ� : ");
		deposit = Integer.parseInt(br.readLine());
		
		if(balance >= deposit) {
			balance -= deposit;
			System.out.println("����� �ܾ��� " + balance + "�� �Դϴ�.");
		}else
			System.out.println("�ܾ��� �����մϴ�.");
		return balance;
	} 

	private static int input(int balance) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("���ݾ� : ");
		int deposit = Integer.parseInt(br.readLine());
		
		if(deposit%10000==0) {
			balance += deposit;
			System.out.println("����� �ܾ��� " + balance + "�� �Դϴ�.");;
		}else
			System.out.println("���� ������");
		return balance;
	}
}

