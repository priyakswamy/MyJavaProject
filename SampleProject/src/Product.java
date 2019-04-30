import java.util.Scanner;
public class Product {

	public Product() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		int a, b,product;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first integer");
		a = in.nextInt();
		System.out.println("Enter second integer");
		b =in.nextInt();
		product = a*b;
	System.out.println("Product = " +product);	
}
}