import java.util.Scanner;
public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean Isproceed = true;
		while (Isproceed) {
		Scanner type = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = type.nextInt();
		
		if (num % 2 == 0) {
		System.out.println("Number is even");
		}
		else{
			System.out.println("Number is odd");
		}
	
	System.out.println();
	System.out.println();
	
	System.out.println("do you want to continue : Y or N");
	Scanner op = new Scanner(System.in);
	String Continue = op.next();
	if (Continue.equalsIgnoreCase("y")){
		Isproceed = true;
	}
		else {
			Isproceed = false;
		System.out.println("Exiting");
			
		}
	}	
	}

}