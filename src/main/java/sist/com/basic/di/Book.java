package sist.com.basic.di;
//DI 
public class Book {
	private String bookName;
	private int price;
	private String author;	
	
	public Book() {
		System.out.println("BookDefault");
	}
	
	public Book(String author) {
		super();
		this.author = author;
	}

	public Book(String bookName, int price, String author) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", price=" + price + ", author=" + author + "]";
	}
	
	
	

}
