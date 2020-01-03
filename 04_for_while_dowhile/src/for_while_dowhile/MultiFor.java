package for_while_dowhile;

public class MultiFor {

/*	
	2*1=2
	2*2=4
	2*9=18
*/
	public static void main(String[] args) {
		int dan, i;
		
		//for(초기값;조건식;증감식)
		for(dan = 2; dan<=9; dan++) {
			
			for(i=1; i<=9; i++) {
				System.out.println(dan+"*"+i+"="+dan*i);
			}			
		}//for dan
	}

}
