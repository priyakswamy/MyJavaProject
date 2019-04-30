
public class Cat extends Animal implements Pet {
	
	public Cat() {
		System.out.println("Inside Cat constructor");
	}
	
	Cat(String color) {
		System.out.println("Inside Cat Parameterized constructor");
		this.color = color;
	}
	
	static {
		System.out.println("Static method inside Cat class");
	}

	String color;

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String typeOfSound() {
		// TODO Auto-generated method stub
		return "Meow Meow";
	}

}
