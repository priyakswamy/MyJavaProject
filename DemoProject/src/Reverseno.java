import java.util.Scanner;

public class Reverseno {

	public static void main(String[] args) {
		int a, rn = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a no");
		a = s.nextInt();

		while (a != 0) {

			rn = (rn * 10) + (a % 10);
			a = a / 10;
		}
		System.out.println(rn);

	}
}
