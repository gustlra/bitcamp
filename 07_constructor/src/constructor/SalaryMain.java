package constructor;
/*
	직원들의 월급을 계산하는 프로그램을 작성하시오
	객체 배열로 작성하시오
	생성자를 통해서 데이터를 입력
	계산은 calc()
	name, position, basePay, benefit, taxRate, tax, salary
	
	세금 = (기본급 + 수당) * 세율;
	월급 = 기본급 + 수당 - 세금;
	
	세율은 200만원 이하 : 1%(0.01), 
	     400만원 이하 : 2%(0.02), 
	     400만원 초과 : 3%(0.03)으로 설정한다.
	
	[실행결과]
	이름		직급		기본급		수당		세율		세금		월급
	유재석	부장		5000000		200000
	박명수	과장		3500000		150000
	정준하	사원		1800000		100000
 */

import java.beans.DesignMode;
import java.text.DecimalFormat;

public class SalaryMain {

	public static void main(String[] args) {
		SalaryDTO[] ar = new SalaryDTO[3];
		
		ar[0] = new SalaryDTO("유재석","부장",5000000,200000);
		ar[1] = new SalaryDTO("박명수","과장",3500000,150000);
		ar[2] = new SalaryDTO("정준하","사원",1800000,100000);
		
		DecimalFormat df = new DecimalFormat("#,###");
		
		System.out.println("[실행결과]");
		System.out.println("이름\t직급\t기본급\t  수당\t세율\t  세금\t     월급");
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
