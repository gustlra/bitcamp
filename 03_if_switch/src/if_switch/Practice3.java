package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	[����3]
	���ڸ� �Է��Ͽ� ����� ���Ͻÿ�
	
	[������]
	���� �Է� : 12
	1   2   3   4   6   12
	
	����o
	for {
		if
	}n
	�Ұ���x
	if{
		for
	}
*/

public class Practice3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("���ڸ� �Է��Ͽ� ����� ���Ͻÿ�.");
		System.out.println("[������]");
		System.out.println("���� �Է� : ");
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
