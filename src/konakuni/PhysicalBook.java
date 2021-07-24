package konakuni;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PhysicalBook extends Book{
	
	private int numPage;
	private boolean hardCover;

	public PhysicalBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhysicalBook(String iSBN, String title, int quantity) {
		super(iSBN, title, quantity);
		// TODO Auto-generated constructor stub
	}

	public PhysicalBook(int numPage, boolean hardCover) {
		super();
		this.numPage = numPage;
		this.hardCover = hardCover;
	}
	
	public void setPhysicalBook(String iSBN, String title, int quantity,int page, boolean hardcover) {
		super.setBook(iSBN, title, quantity);
		this.numPage = page;
		this.hardCover = hardcover;
	}
	
	public Double estimatedPrice() {
		
		//Does hardcover included ? 
		Double basePrice = 0.0;
		Double estimatedPrice = 0.0;
		int addPage = 0;
		Double additionalprice = 0.0;
		
		if(this.hardCover) { // if hardcover needed
			basePrice = 10.0;
		}
		
		if(this.numPage < 100) { //less than 100 pages
			 return estimatedPrice = basePrice + 30.0;
		}
		
		else if( this.numPage >= 100 && this.numPage < 200) {
			return estimatedPrice = basePrice + 60.0;
		}
		
		else if( this.numPage >= 200) {
			addPage =  this.numPage - 200;
			System.out.println(addPage);
			additionalprice = (double) (addPage / 30 * 5);
			return 60.0 + additionalprice + basePrice;
		} 
		
		return estimatedPrice;
	}
	

	@Override
	public String toString() {
		return "PhysicalBook [numPage=" + numPage + ", hardCover=" + hardCover + ", quantity=" + quantity
				+ ", estimatedPrice()=" + estimatedPrice() + ", getQuantity()=" + getQuantity() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
