
public class Animal extends Creature {
	
	Animal() {
		System.out.println("Inside Animal constructor");
	}
	
	Animal(int noOfLegs) {
		System.out.println("Inside Animal parameterized constructor");
		this.noOfLegs = noOfLegs;
	}
	
	static {
		System.out.println("Static method inside Animal Class");
	}
	
	int noOfLegs;

	/**
	 * @return the noOfLegs
	 */
	public int getNoOfLegs() {
		return noOfLegs;
	}

	/**
	 * @param noOfLegs the noOfLegs to set
	 */
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

}
