package class_02;

import static java.lang.Math.*;//*-모든것
import static java.lang.String.format;
import static java.lang.System.out;

public class ImportStatic {

	public static void main(String[] args) {
		out.println("난수  = " + random());
		System.out.println("제곱  = " + pow(2,5));
		System.out.println("소수 이하 2째자리 = "+format("%.2f", 12.34567));

	}

}
