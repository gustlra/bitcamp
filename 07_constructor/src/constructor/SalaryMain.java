package constructor;
/*
	�������� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�
	��ü �迭�� �ۼ��Ͻÿ�
	�����ڸ� ���ؼ� �����͸� �Է�
	����� calc()
	name, position, basePay, benefit, taxRate, tax, salary
	
	���� = (�⺻�� + ����) * ����;
	���� = �⺻�� + ���� - ����;
	
	������ 200���� ���� : 1%(0.01), 
	     400���� ���� : 2%(0.02), 
	     400���� �ʰ� : 3%(0.03)���� �����Ѵ�.
	
	[������]
	�̸�		����		�⺻��		����		����		����		����
	���缮	����		5000000		200000
	�ڸ��	����		3500000		150000
	������	���		1800000		100000
 */

import java.beans.DesignMode;
import java.text.DecimalFormat;

public class SalaryMain {

	public static void main(String[] args) {
		SalaryDTO[] ar = new SalaryDTO[3];
		
		ar[0] = new SalaryDTO("���缮","����",5000000,200000);
		ar[1] = new SalaryDTO("�ڸ��","����",3500000,150000);
		ar[2] = new SalaryDTO("������","���",1800000,100000);
		
		DecimalFormat df = new DecimalFormat("#,###");
		
		System.out.println("[������]");
		System.out.println("�̸�\t����\t�⺻��\t  ����\t����\t  ����\t     ����");
		for(SalaryDTO dto : ar) {
			dto.calc();
			System.out.println(dto.getName()+"\t"
					+dto.getPositione()+"         "
					+dto.getBasePay()+"\t"
					+dto.getBenefit()+"\t"
					+dto.getTaxRate()+"\t"
					+dto.getTax()+"\t"
					+df.format(dto.getSalary()));
		}
		
		
		//SalaryDTO(5000000,200000);
		//System.out.println(aa.getName()+aa.getPosition());
		
		
		

	}

}
