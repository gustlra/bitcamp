package constructor;

public class VarArgs {
	
//	public int sum(int a, int b) {
//		return a+b;
//	}
//	public int sum(int a, int b, int c) {
//		return a+b+c;
//	}
//	public int sum(int a, int b, int c, int d) {
//		return a+b+c+d;
//	}

	public int sum(int... ar) {//... ¹è¿­¿ªÈ°
		int tot=0;;
		for(int i=0; i<ar.length; i++) {
			tot +=ar[i];
		}
		return tot;
	}
	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		
		System.out.println("¿øÀÇ ³ĞÀÌ : "+va.sum(10,20));
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ : "+va.sum(10,20,30));
		System.out.println("»ç´Ù¸®²ÃÀÇ ³ĞÀÌ : "+va.sum(10,20,30,40));

	}

}
