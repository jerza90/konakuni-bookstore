package konakuni;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
	
	private String ISBN;
	private String title;
	protected int quantity ; //pages
	
	public Book() {
		
	}
	
	public Book(String iSBN, String title, int quantity) {
		this.ISBN = iSBN;
		this.title = title;
		this.quantity = quantity;
	}
	
	public void setBook(String iSBN, String title, int quantity)
	{
		this.ISBN = iSBN;
		this.title = title;
		this.quantity = quantity;
	}
	
	public Double estimatedPrice() 
	{
		return 0.0;
	}
	
	public int getQuantity() {
		return quantity;
	}

	
	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", quantity=" + quantity + "]";
	}

}
