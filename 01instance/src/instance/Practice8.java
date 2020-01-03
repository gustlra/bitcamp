package instance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
	[����1]
	����(dec)�� �Է¹޾Ƽ� 2����(binary), 8����(octor), 16����(hexa) ��ȯ�Ͻÿ�
	IntegerŬ���� �޼ҵ带 �̿��Ͻÿ�
	
	[������]
	10������ �Է��ϼ��� : 250
	
	2���� = 11111010
	8���� = 372
	16���� = fa

 */
public class Practice8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("10������ �Է��ϼ��� : ");
		int dec = Integer.parseInt(br.readLine());
		
		System.out.println();
		String binary = Integer.toBinaryString(dec);
		String octor = Integer.toOctalString(dec);
		String hexa = Integer.toHexString(dec);
		
		System.out.println("2���� = "+binary);
		System.out.println("8���� = "+octor);
		System.out.println("16���� = "+hexa);
		
	}

}
