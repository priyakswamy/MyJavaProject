
public class Abstraction {

	public static void main(String[] args) {
		dogs puppy = new dogs();
		puppy.setType("Lab");
		System.out.println(puppy.getType());
		cats meow = new cats();
		//meow.setType("Kitty");
		System.out.println(meow.getType());

	}

}

abstract class animals {
	protected String type;

	public abstract void setType(String type);

	public abstract String getType();

}

class dogs extends animals {

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}

class cats extends animals {

	/**
	 * @return the type
	 */
	public String getType() {
		return "Kitty";
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}
