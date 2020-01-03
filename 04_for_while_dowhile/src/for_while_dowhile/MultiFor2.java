package for_while_dowhile;

public class MultiFor2 {

	public static void main(String[] args) {
		int dan, i;
				
		//for(초기값;조건식;증감식)
		for(i = 1; i<=9; i++) {
			
			for(dan=2; dan<=9; dan++) {
				System.out.print(dan+"*"+i+"="+dan*i+"	");
			}
			System.out.println();
		}//for dan

	}

}
