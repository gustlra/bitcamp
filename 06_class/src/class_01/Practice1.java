package class_01;
/*
	setter / getter �ۼ�
	Ŭ������ BookShop
	�ʵ� : bokkName, author, price
	
	[������]
	å�̸� : �ڹٿϼ�
	��   �� : ��ϼ�
	��   �� : 25000��
	
	å�̸� : JSP���
	��   �� : ��JP
	��   �� : 35000��
 */

public class Practice1 {
	public static void main(String[] args) {
		BookShop bs1 = new BookShop();
		
		bs1.setBookName("�ڹٿϼ�");
		bs1.setAuthor("��ϼ�");
		bs1.setPrice(25000);
		
		BookShop bs2 = new BookShop();
		
		bs2.setBookName("JSP���");
		bs2.setAuthor("��JP");
		bs2.setPrice(35000);
		
		System.out.println("[������]");
		System.out.println();
		System.out.println("å�̸� : "+ bs1.getBookName());
		System.out.println("��   �� : "+ bs1.getAuthor());
		System.out.println("��   �� : "+ bs1.getPrice()+"��");
		System.out.println();
		System.out.println("å�̸� : "+ bs2.getBookName());
		System.out.println("��   �� : "+ bs2.getAuthor());
		System.out.println("��   �� : "+ bs2.getPrice()+"��");
		
		
		}
}
