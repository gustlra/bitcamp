package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = (int) ((Math.random()*9)+2);//2~10
		
		String[] ar;
		ar = new String[size];
		
		System.out.println("�迭�� ar = "+ar);
		System.out.println("�迭ũ�� = "+ar.length);//ar.length
		
		for(int i=0; i<ar.length; i++) {
			System.out.println("���ϸ� �Է� : ");
			ar[i] = br.readLine();
		} 
		for(String data : ar) {
			System.out.println(data);
			System.out.println("ù��° ���� : "+data.charAt(0));
			System.out.println("���ڿ� ũ�� = "+data.length());
			System.out.println();
		}
		
		
	}

}