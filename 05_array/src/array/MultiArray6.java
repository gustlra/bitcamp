package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class MultiArray6 {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			//�л��� �Է�
			System.out.print("�л����� �Է��Ͻÿ�");
			int cnt = Integer.parseInt(br.readLine());
			
			//�л��� ��ŭ �迭 
			String name[] = new String[cnt];
			String subject[][]= new String[cnt][];
			int jumsu[][] = new int[cnt][];
			double[] avg = new double[cnt];
			DecimalFormat df = new DecimalFormat();
			int subjectCnt;
			
			for(int i=0; i<cnt; i++) {
				System.out.print("�̸� : ");
				name[i] = br.readLine();
				
				//�����	
				System.out.println("������� �Է��Ͻÿ�.");
				subjectCnt = Integer.parseInt(br.readLine());
				subject[i] = new String[subjectCnt];
				for(int j=0; j<subjectCnt; j++) {
					System.out.println("����� : ");
					subject[i][j] = br.readLine();
				}//for j
				
				jumsu[i] = new int[subjectCnt+1];
				for(int j=0; j<subjectCnt; j++) {
					System.out.println(subject[i][j] + "�����Է�");
					jumsu[i][j] = Integer.parseInt(br.readLine());
				
				
				//����
				jumsu[i][subjectCnt] += jumsu[i][j];
				}//for j
				
				//���
				avg[i] = (double)jumsu[i][subjectCnt] / subjectCnt;
				
				System.out.println("");
					
			}//for i
			for(int i=0; i<cnt; i++) {
				System.out.println("�̸�\t");
				for(int j=0; j<subject[i].length; j++) {
					System.out.println(subject[i][j] + "\t");
				}
				System.out.println("����\t���");
				
				System.out.println(name[i] + "\t");
				for(int j=0; j<jumsu[i].length; j++) {
					System.out.println(jumsu[i][j] + "\t");
				}
				System.out.println(df.format(avg[i]));
				System.out.println();
			}

			
/*
			int cnt;
			double avg = 0;
			int subjectCnt;
			int[] jumsu = null;
			
			System.out.println("�л����� �Է��Ͻÿ�");
			cnt = Integer.parseInt(br.readLine());
			String[] name = new String[cnt];
			for(int i=0; i<name.length; i++) {
				System.out.println("�̸��Է� : ");
					name[i] = br.readLine();
			}
			System.out.println("����� �Է� : ");
			subjectCnt = Integer.parseInt(br.readLine());
			String subject[] = new String[subjectCnt];
			for(int i=0; i<subject.length; i++) {
				System.out.println("����� �Է� : ");
				subject[i] = br.readLine();
				}
				for(int j=0; j<subject.length; j++) {
				System.out.println(subject[j]+"���� �Է� : ");
				jumsu = new int[subjectCnt];
				jumsu[j] = Integer.parseInt(br.readLine());
							
				
			}System.out.println(name[0]+"\t"+subject[0]);
		
		
*/		
		}
}
/*
	�ο����� �Է��Ͽ� �ο�����ŭ �����͸� �Է¹ް� ������ ����� ���Ͻÿ�
	����� �Ҽ����� �ι�° �ڸ�����
	
	[������]
	�ο��� : 2(cnt)
	
	�̸��Է� : ȫ�浿(name)
	����� �Է� : 2(subjectCnt)
	����� �Է� : ����(subject)
	����� �Է� : ����(
	
	���� ����  �Է� : 95(jumsu)
	���� ���� �Է� : 100
	
	�̸� ���� ���� ���� ���
	
	�̸� ���� ���� ���� ���� ���
*/
