package instance;

public class Practice3 {

	public static void main(String[] args) {
		//이름이 L(name)인 사람의 기본급(basePay)이 2500000일때 3.3% 세금(tax)과 월급(salary)을 계산하시오. 데이터는 반드시 변수에 저장하기.
		//세금 = 기본급 * 3.3%(0.033)
		//월급 = 기본급-세금
		int b = 2500000; //기본급
		double c = 0.033; //세금
		int d = (int) (b*c);
		int e = b-d;
		
		System.out.println("L의월급");
		System.out.println("기본급="+b+"원 \t 세금="+d+"원 \t 월급="+e+"원");
		/*	 
		 * 
		 
			
		
		System.out.println("L세금 = " +b*c);
		
		double d = b*c;
		
		System.out.println("L월급 = " +b-d);
		*/
	}

}
