package class_02;

import java.util.Scanner;

/*
	[����1]
	ġȯ�ϴ� ���α׷��� �ۼ��Ͻÿ�
	String Ŭ������ �޼ҵ�(indexOf(), replace())�� �̿��Ͻÿ�
	��ҹ��� ������� ������ ����Ͻÿ�
	
	[������]
	���ڿ� �Է� : aabba
	���� ���ڿ� �Է� : aa
	�ٲ� ���ڿ� �Է� : dd
	ddbba
	1�� ġȯ
	
	���ڿ� �Է� : aAbbA
	���� ���ڿ� �Է� : aa
	�ٲ� ���ڿ� �Է� : dd
	ddbba
	1�� ġȯ
	
	���ڿ� �Է� : aabbaa
	���� ���ڿ� �Է� : aa
	�ٲ� ���ڿ� �Է� : dd
	ddbbdd
	2�� ġȯ
	
	���ڿ� �Է� : AAccaabbaaaaatt
	���� ���ڿ� �Է� : aa
	�ٲ� ���ڿ� �Է� : dd
	ddccddbbddddatt
	4�� ġȯ
	
	���ڿ� �Է� : aabb
	���� ���ڿ� �Է� : aaaaa
	�ٲ� ���ڿ� �Է� : ddddd
	�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�
 */

public class Practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index=0;//��ġ
		int count=0;//����
		System.out.println("���ڿ� �Է� : ");
		String str = sc.next();
		
		
		System.out.println("���� ���ڿ� �Է� : ");
		String target = sc.next();
		
		System.out.println("�ٲ� ���ڿ� �Է� : ");
		String replacing = sc.next();
		
		if(str.length() < target.length()) {
			System.out.println("�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�.");
			return;
		}
		str = str.toLowerCase();
		target = target.toLowerCase();

		while((index=str.indexOf(target, index)) != -1) {
			index += target.length();
			count++;
		}//while
		
//		for(int i =0; i<str.length(); i++) {
//			if(str.contains("aa")) {
//				str = str.replaceFirst("aa", "dd");
//				count++;
//			}else {
//				break;
//			}
//		}
//		//("aa",str.indexOf("aa")+1);
//		
		

		System.out.println(str.replace(target, replacing));
		System.out.println(count+"�� ġȯ�߽��ϴ�."); 
		System.out.println();
		
	}


}
