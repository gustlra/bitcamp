package instance;

/*
	문제
	320, 258을 변수에 저장하여 합을 구하시오 
	[결과]
	320 + 258 = xxx
	a + b = sum
 */
/*
 	문제
 	320 - 358 = xxx(sub)
 	320 * 258 = xxx(mul)
 	320 / 258 = 1.24~~~(div)
 	
 	추가문제  320 / 258 string으로
 */
public class NumberTest {

	public static void main(String[] args) {
		
		short a = 320;
		short b = 258;
		int sum = a+b; // 형변환은 오른쪽에서만 왼쪽X
		int sub = a-b;
		int mul = a*b;
		//String div = String.format("%.2f",(double)a/b;
		double div = (double)a/b;
		
		System.out.println(a+" + "+b+" = "+sum);
		System.out.println(a+" - "+b+" = "+sub);
		System.out.println(a+" * "+b+" = "+mul);
		System.out.println(a+" / "+b+" = "+ String.format("%.2f" , div)); //Stirng.format("%.?f", ?)소수점 계산 기억할것

	}

}
