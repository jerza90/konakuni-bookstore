package konakuni;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalBook extends Book{
	
	private int memorySize;
	private PurchaseDate purchaseDate;
	
	public DigitalBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DigitalBook(String iSBN, String title, int quantity, int memSize, PurchaseDate dt) {
		super(iSBN, title, quantity);
		this.memorySize  = memSize;
		this.purchaseDate = dt;
		// TODO Auto-generated constructor stub,
	}

	public void setDigitalBook(String iSBN, String title, int quantity, int memSize, PurchaseDate dt) {
		// TODO Auto-generated method stub
		super.setBook(iSBN, title, quantity);
		this.memorySize  = memSize;
		this.purchaseDate  = dt;
	}

	
	public Double estimatedPrice() {
		//Does hardcover included ? 
		//
		
		Double estimateprice = 0.0;
		int addKB = 0;
		
		Double additionalprice = 0.0;
	
		
		if(this.memorySize < 200) { //less than 100 pages
			
			 return checkDiscount(estimateprice + 30.0);
		}
		
		else if( this.memorySize >= 200 && this.memorySize <= 500) {
			
			return checkDiscount(estimateprice + 30.0);
		}
		
		else if( this.memorySize > 500) {
			
			addKB =  this.memorySize - 500;
			//System.out.println(addKB);
			additionalprice = (double) (addKB / 30 * 3);
			return checkDiscount(100.00 + additionalprice);
		} 
		
		return checkDiscount(estimateprice);
		
	}
	
	public Double checkDiscount(Double estimatedPrice) {
		
		if(this.purchaseDate.getDay() == "22" && this.purchaseDate.getMonth() == "07") {
			return estimatedPrice = estimatedPrice - (estimatedPrice * 0.1);
		}
		
		return estimatedPrice;
	}

	public int getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}

	@Override
	public String toString() {
		return "DigitalBook [memorySize=" + memorySize + ", purchaseDate=" + purchaseDate.toString() + ", quantity=" + quantity
				+ ", estimatedPrice()=" + estimatedPrice() + ", getQuantity()=" + getQuantity() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}	
	
}
