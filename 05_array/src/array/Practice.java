package array;
/*
	[����1]
	ũ�Ⱑ 50���� ���ڹ迭�� ��Ƽ� 65~90������ ������ �߻��Ͽ� ���� �� ����Ͻÿ�
	A ~ Z���� ����� ���
	�� 1�ٿ� 10���� ���
	
	[������]
	D F A G H I J K L T
	O P W E R F V A S B
	P Y R O L E E Z L I
	F E U Z T U P P P A
	S P G B F F O W J C
	
	A : 2
	B : 3
	...
	X : 0
	Y : 1
	Z : 0
*/

public class Practice {
 
	public static void main(String[] args) {
		int ar[] = new int[50];
		int count[] = new int[26];
		
		for(int i=0; i<ar.length; i++) {
			ar[i] = (int)(Math.random()*26+65);
			System.out.print((char)ar[i]+" ");
			if((i+1)%10==0) System.out.println();
			//%10==0 - ������10==0�̶��
		}
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<count.length; j++) {
				if(ar[i]==j+'A') count[j]++;
			}
		}
		System.out.println();
		for(int i=0; i<count.length; i++) {
			System.out.println((char)(i+'A')+"\t"+count[i]);
		}
	/*
		arr[0] = (int)(Math.random()*26+65);//65~90
		arr[1] = (int)(Math.random()*26+65);//65~90
		arr[2] = (int)(Math.random()*26+65);//65~90
		arr[3] = (int)(Math.random()*26+65);//65~90
		arr[4] = (int)(Math.random()*26+65);//65~90
		arr[46] = (int)(Math.random()*26+65);//65~90
		for���x 
	*/
	}

}
