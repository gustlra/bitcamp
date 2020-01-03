package method;

public class MethodTest {

	public static void main(String[] args) {
		int big = Math.max(25, 36); //Math max 함수
		System.out.println("큰값="+big);
		int small = Math.min(25, 36); //Math min 함수
		System.out.println("작은값="+small);
		
		double power = Math.pow(2,5);
		System.out.println("2의 5승은" + (int)power);
		
		//난수 - 컴퓨터가 불규칙하게 발생하는 수를 나수라고 한다. 0.0 <= 난수 < 1.0
		//int a = (int)(Math.random()*100); //0~99
		//int a = (int)(Math.random()*100)+1; //1~100
		
		int a = (int)(Math.random()*26)+65; //65~95
		System.out.println((char)a);
		
		System.out.println('2'+'5'); // 아스키코드 '0' = 48(외우세요) 
		System.out.println('2'-48 + '5'-48); // '0'-48 = 0
		System.out.println();
		
		System.out.println("2" + "5.7");//"25"(문자열)
		System.out.println(Integer.parseInt("2") + Double.parseDouble("5.7"));//7.7
	}

}
