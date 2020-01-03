package class_01;
/*
	setter / getter 작성
	클래스명 BookShop
	필드 : bokkName, author, price
	
	[실행결과]
	책이름 : 자바완성
	저   자 : 김완성
	가   격 : 25000원
	
	책이름 : JSP잡기
	저   자 : 송JP
	가   격 : 35000원
 */

public class Practice1 {
	public static void main(String[] args) {
		BookShop bs1 = new BookShop();
		
		bs1.setBookName("자바완성");
		bs1.setAuthor("김완성");
		bs1.setPrice(25000);
		
		BookShop bs2 = new BookShop();
		
		bs2.setBookName("JSP잡기");
		bs2.setAuthor("송JP");
		bs2.setPrice(35000);
		
		System.out.println("[실행결과]");
		System.out.println();
		System.out.println("책이름 : "+ bs1.getBookName());
		System.out.println("저   자 : "+ bs1.getAuthor());
		System.out.println("가   격 : "+ bs1.getPrice()+"원");
		System.out.println();
		System.out.println("책이름 : "+ bs2.getBookName());
		System.out.println("저   자 : "+ bs2.getAuthor());
		System.out.println("가   격 : "+ bs2.getPrice()+"원");
		
		
		}
}
