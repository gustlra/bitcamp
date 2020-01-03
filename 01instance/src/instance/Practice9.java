package instance;
/*
 	주사위를 2번 던져서 나온 값의 합을 구하시오
	주사위는 input()에서 1~6사이의 난수를 발생하여 리턴한다
	합은 add()에서 구하여 리턴 받는다
*/

public class Practice9 {

	public static void main(String[] args) {

		Practice9 p9 = new Practice9();

		int su1 = p9.input();
		System.out.println("첫번째 주사위 값 : " + su1);
		int su2 = p9.input();
		System.out.println("두번째 주사위 값 : " + su2);

		System.out.println("합은 " + p9.add(su1, su2) + " 이다");
	}
	
	public int input() {
		int su = (int) (Math.random() * 6 + 1);
		return su;
	}

	public int add(int su1, int su2) {
		return su1 + su2;
	}

}
