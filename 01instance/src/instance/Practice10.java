package instance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	[����3]
	�ʸ� �Է¹޾Ƽ� time()���� ��,��,�ʸ� ���Ͽ� ����Ѵ�
	
	[������]
	�ʸ� �Է��Ͻÿ� : 3850
	1�ð� 4�� 10�� �Դϴ�
 
 */

public class Practice10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Practice10 p10 = new Practice10();
		System.out.println("�ʸ� �Է��Ͻÿ� : ");
		int second = Integer.parseInt(br.readLine());
		p10.time(second);
		System.out.println("���α׷��� �����մϴ�.");
		
		
	}

	public void time(int second) {
		int hour = second / 3600; //1�ð� = 3600��
		int minute = second % 3600 / 60; //1�� = 60��
		int sec = second % 3600 % 60;
		System.out.println(hour +"�ð�"+minute+"��"+sec+"�� �Դϴ�");
		// TODO Auto-generated method stub
		
	}

}
