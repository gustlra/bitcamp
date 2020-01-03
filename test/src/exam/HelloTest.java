package exam;

class HelloTest {
	public static void main(String[] args) {
		System.out.println("안녕하세요");
		System.out.print("반갑습니다\n");
		System.out.println("사과"+"오렌지");
		System.out.println(25 + 36);
		System.out.println("35" + "36");
		System.out.println("25 + 36 = " + 25+36);
		System.out.println("25 + 36 = " + (25+36));
		System.out.println("25 / 36 = " + (25/36));
		System.out.println("25 / 36 = " + (25.0/36));
		System.out.println("25 / 36 = " + (int)(25.0/36*10+0.5)/10.0); //소수이하 첫자리
		System.out.println("25 / 36 = " + String.format("%.1f", (25.0/36)) ); //소수점  계산

	}
}