
public class Dog extends Animal implements Pet {
	
	
	Dog() {
		System.out.println("Inside Dog Constructor");
	}
	
	static {
		System.out.println("Static method inside Dog class");
	}
	
	Dog(String breed){
		System.out.println("Inside Dog Parameterized constructor");
		this.breed = breed;
	}
	
	String breed;

	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String typeOfSound() {
		// TODO Auto-generated method stub
		return "Bowwow";
	}
	
}
