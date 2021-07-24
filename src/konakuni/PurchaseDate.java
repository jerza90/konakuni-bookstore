package konakuni;

public class PurchaseDate {
	
	private String day;
	private String month; 
	private String year;
	
	
	public PurchaseDate(String day, String month, String year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		this.day = day;
	}


	public String getMonth() {
		return month;
	}


	public void setMonth(String month) {
		this.month = month;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "PurchaseDate=" + day + month + year;
	}


}
