
public class aOrderedList {
	final int SIZEINCREMENTS = 20; 
	@SuppressWarnings("unused")
	private car[] oList; 
	private int listSize; 
	private int numObjects;
	
	public aOrderedList() {
		this.numObjects = 0;
		this.listSize = SIZEINCREMENTS;
		this.oList = new car[SIZEINCREMENTS];
		
		//int nums[]= new int[size];
	}
	
	public void add(car newCar) {
		oList.add(newCar);
	}
	 public String toString() {
	 		return "[" + super.toString() + "]";
	  }

	
}
