package instance;

public class Practice5 {
	/*	[문제5]
	변수 score의 값이 2와 3의 공배수인지 아닌지를 출력하시오 (변수 score 값은 랜덤)
	(나머지가 0이된다)
	[실행결과]
	25는 2와 3의 공배수가 아니다 (score=25일때)
	또는
	12는 2와 3의 공배수이다 (score=12일때)
	 */
	public static void main(String[] args) {
	
		int score = 12;
		String result = score%2==0 && score%3==0 ? "공배수다" : "공배수가 아니다";
		System.out.println(score+ "는 2와 3의"+ result);
		
	}

}
