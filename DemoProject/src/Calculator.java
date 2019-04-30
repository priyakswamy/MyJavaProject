import java.util.Scanner;

public class Calculator {

public void input() {
	int sum ;
	int sub;
	int mult;
	int div;
	
	//int count = 1;
	while(true) {
	Scanner s = new Scanner(System.in);	
	 
	System.out.println("Enter operation");
	
	
	 String operation = s.nextLine();
 
	
		System.out.println("Enter 1st number");
		int a = s.nextInt();
		System.out.println("Enter 2nd number");
		int b = s.nextInt();	
	
	if (operation.equals("sum")) {
		sum = a+b;
		System.out.println("Result= " +sum);
	}
	else if (operation.equals("sub")) {
		sub = a-b;
		System.out.println("Result= " +sub);

	}
	
	else if (operation.equals("mult")) {
		mult = a*b;
		System.out.println("Result= " +mult);

	}
	else if (operation.equals("div")) {
		div = a/b;
		System.out.println("Result= " +div);
	}
	
	else  {
		System.out.println("Invalid inbput");
		break;
	}
	
}		
}

		

	 


					 		 	

/*private void add(int a, int b) {

int sum = a+b;	
System.out.println("Answer= " +sum);
	}*/
		






	public static void main(String[] args) {
	Calculator calc = new Calculator();
	calc.input();
	
	
	}

}
