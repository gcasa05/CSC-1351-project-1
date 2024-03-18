
public class car implements Comparable<car> {
	private String make;
	private int year;
	private int price;
	
	
	public car(String Make, int Year, int Price) {
		this.make = Make;
		this.year = Year;
		this.price = Price;
		
	}
	
	public String getMake() {
		return this.make;
	}
	
	public int getYear() {
		return this.year;
	}
	public int getPrice() {
		return this.price;
	}
	public String toString() {
		return "Make: " + make + ", Year :" + year + ", Price: " +
				price + ";";
	}

	
	public int compareTo(car other) {
		int  mk = 0;
		
		if (!this.make.equals(other.make)) {
			mk = this.make.compareTo(other.make);
			return mk;
		}
		else if(this.year != other.year) {
			mk = Integer.compare(this.year, other.year);
			
			}
		return mk;
		
	
	}
	
	

}

