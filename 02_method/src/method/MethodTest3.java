package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest3 {

	public static void main(String[] args) throws IOException {
		//�̸�, ����, ����, ������ �Է� �޾Ƽ� ����, ����� ���Ͻÿ�.
		//���� calcTot()���ؿ���
		//���calcAvg()���ؿ���
		//������ - �̸�, 90, 85, 100, ???,  ??.??
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		System.out.println("�̸� �Է� : ");
		String name = br.readLine();
		
		System.out.println("���� �Է� : ");
		int kor = Integer.parseInt(br.readLine());
		
		System.out.println("���� �Է� : ");
		int eng = Integer.parseInt(br.readLine());
		
		System.out.println("���� �Է� : ");
		int math = Integer.parseInt(br.readLine());
		
		MethodTest3 mt = new MethodTest3();
		int tot = mt.calTot(kor, eng, math);
		double avg = mt.calAvg(tot);
		
		System.out.println("***" +name+ "����ǥ ***");
		System.out.println("�̸� \t ���� \t ���� \t ���� \t ���� \t ���");
		System.out.println(name+ "\t" +kor+ "\t" +eng+ "\t" +math+ "\t" +tot+ "\t" +String.format("%.2f",avg));
	}//main
	
		public int calTot(int kor, int eng, int math) {
			return kor+eng+math;
		}//calTot
		
		public double calAvg(int tot) {
			return tot/3.0;
		}
	

}
/*
�̸� �Է� : ȫ�浿
���� �Է� : 92
���� �Է� : 100
�����Է� : 85
*/