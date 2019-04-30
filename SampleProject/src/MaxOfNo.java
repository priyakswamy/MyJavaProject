import java.util.Scanner;

public class MaxOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner maximum = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = maximum.nextInt();
		System.out.println("Enter num2");
		int num2 = maximum.nextInt();
		if (num1 > num2) {
			System.out.println("Num1 greater than num2");
		} else {
			System.out.println("Num2 is greater than num2");
		}
	}

}
