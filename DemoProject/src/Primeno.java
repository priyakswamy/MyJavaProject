import java.util.Scanner;

public class Primeno {

	
	public static void main(String[] args) {
		int a, count=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a no");
		a = s.nextInt();
		
for (int i=2;i<a;i++) {
	if(a%i==0) {
		count++;
	}
}
	if (count==0) {
		System.out.println("a is  prime");
	}
	
	else {
		System.out.println("a is not prime");
	}
			}
			
				}
				
			
		
	


