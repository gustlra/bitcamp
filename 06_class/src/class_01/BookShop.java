package class_01;

public class BookShop {
	String bookName, author;
	int price;
	
	public void setBookName(String book) {
		bookName = book;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
}
