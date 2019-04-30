
public class Creature {
	
	Creature() {
		System.out.println("Inside creature constructor");
	}
	
	Creature(String type) {
		System.out.println("Inside creature parameterized constructor");
		this.type = type;
	}
	
	static {
		System.out.println("Static method inside Creature class");
	}
	
	
	String type;

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
