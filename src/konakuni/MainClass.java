package konakuni;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World");
	
		
		//Test Digital Book
		DigitalBook book1 = new DigitalBook();
		PurchaseDate datebuy = new PurchaseDate("24","07","2021");
		book1.setDigitalBook("D-Book1","Buku Digital 1",1, 560, datebuy);
		System.out.println(book1.toString());
					
		//Test Physical Book
		PhysicalBook book2 = new PhysicalBook();
		book2.setPhysicalBook("P-Book2","Buku Physical 1", 1, 230, false);
		System.out.println(book2.toString());

	}

}
