import java.util.Arrays;
import java.util.Scanner;

public class Arraydemo {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter no of elements in an array");
	int n = s.nextInt();
	int arr [] = new int[n];
	System.out.println("Enter elements");
	for(int i=0;i<arr.length;i++){
		arr[i] = s.nextInt();
	}
	//for(int i : arr) {
		//System.out.println(i);
	//}
	
	Arrays.sort(arr);
	
	int size = arr.length;
	System.out.println(Arrays.toString(arr));
	int secondhigh = arr[size-2];
	System.out.println(secondhigh);
	System.out.println(arr[1]);
	}

}
