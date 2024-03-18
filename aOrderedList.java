import java.util.Arrays;

public class aOrderedList {
	final int SIZEINCREMENTS = 20; 
	
	private car[] oList; 
	private int listSize; 
	private int numObjects;
	
	public aOrderedList() {
		this.numObjects = 0;
		this.listSize = SIZEINCREMENTS;
		this.oList = new car[SIZEINCREMENTS];
		
		//int nums[]= new int[size];
	}
	
	public int size() {
		return numObjects;
	}
	public car get(int index) {
		return oList[index];
	}
	public boolean isEmpty() {
	 if(oList == null) {
		 return true;
	 } else {
		 return false;
	 }
			
		
	}
	public void remove(int index) {
		car[] temp = new car[oList.length];//I don't know format
	    for(int i = 0; i<oList.length; i++) {
	        if(i != index)
	        {
	            temp[i] = oList[i];
	           
	        }
	    }
	    temp[oList.length-1] = null;
	    oList = temp;
	}
	
	
	
	public void add(car newCar) {
		oList[numObjects] = newCar;
		numObjects ++; 
		if(numObjects == oList.length) {
			car[] newVal = Arrays.copyOf(oList, 2 * oList.length);
			oList = newVal;

		}
	}
	 public String toString() {
	 		return "[" + super.toString() + "]";
	  }

	
}
