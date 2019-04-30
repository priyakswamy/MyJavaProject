
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
		
		this.one = 1;
		this.two = 2;
	}
	
	// one
	private Integer one;
	// two
	private Integer two;
	
	// getters
	// setters
	
	// method to display values - displayValues
	public String displayValues() {
		
		System.out.println("one = "+ getOne() + " two = "+ getTwo());
		
		return null;
	}

	/**
	 * @return the one
	 */
	public Integer getOne() {
		return one;
	}

	/**
	 * @param one the one to set
	 */
	public void setOne(Integer one) {
		this.one = one;
	}

	/**
	 * @return the two
	 */
	public Integer getTwo() {
		return two;
	}

	/**
	 * @param two the two to set
	 */
	public void setTwo(Integer two) {
		this.two = two;
	}
	
	// display the sum of two values - displaySum
	public void displaySum() {
		Integer sum = getOne() + getTwo();
		System.out.println("Sum = "+sum);
	}

}
