import java.util.Scanner;

public class Calc {

	int a;
	int b;
	// TODO Auto-generated constructor stub

	public static void main(String[] args) {

		// initiating the scanner
		Scanner operation = new Scanner(System.in);

		// creating object for calc
		Calc calc = new Calc();
		boolean isProceed = true;
		while (isProceed) {
			// getting the first variable value
			System.out.println("Enter an integer");
			int a = operation.nextInt();
			calc.setA(a);

			// getting the second variable value
			System.out.println("Enter next integer");
			int b = operation.nextInt();
			calc.setB(b);

			// getting the operator value
			System.out.println("Enter type of operation. It should be only + or - or * or /");
			String c = operation.next();

			switch (c) {
			case "+":
				calc.add(a, b);
				break;
			case "-":
				calc.sub();
				break;
			case "*":
				calc.mult();
				break;
			case "/":
				calc.div();
				break;

			default:
				System.out.println("No operation is matching. Please reenter values");
				break;
			}
			
			System.out.println("    ");
			System.out.println("    ");
			System.out.println("    ");
			System.out.println("    ");
			
			// getting user consent to proceed
			System.out.println("You want to make an other calculation ? Y / N");
			String proceedBool = operation.next();
			if(proceedBool.equalsIgnoreCase("y")) {
				isProceed = true;
			} else {
				isProceed = false;
			}
		}
	}

	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}

	/**
	 * @param a
	 *            the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}

	/**
	 * @param b
	 *            the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}

	public void add(int a, int b) {
		// TODO Auto-generated method stub

		int sum = a + b;
		System.out.println("Sum = " + sum);

	}

	public void sub() {
		int sub = this.getA() - this.getB();
		System.out.println("Sub = " + sub);
	}

	public int div() {
		int div = a / b;
		System.out.println("Div = " + div);
		return div;
	}

	public int mult() {
		int mult = this.getA() * this.getB();
		System.out.println("Mult = " + mult);
		return mult;
	}
}
