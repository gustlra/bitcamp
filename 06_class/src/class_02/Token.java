package class_02;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str = "학원,집,,게임방";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("토큰 개수 = " + st.countTokens());
		
		while(st.hasMoreTokens());{//토큰 있는지 없는지 체크
			System.out.println(st.nextToken());//토큰을 꺼내고 다음으로 이동
		}
		System.out.println("-------------");
		
		String[] ar = str.split(",");
		for(String data : ar) {
			System.out.println(data);
		}

	}

}
