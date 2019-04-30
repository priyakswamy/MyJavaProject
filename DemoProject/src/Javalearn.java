import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Javalearn {

	public void manipulate() {
		 int[] arr = {1,2,3,4,5,6,7,8};
		 int arr1[] = new int[3];
		 int arr2[] = new int[8];
		 
		 
		 for(int k=0; k<3; k++) {
			 arr1[k]=arr[k];
		 }
		 
		 for(int k=3; k<arr.length; k++) {
			 arr2[k-3]=arr[k];
			 
		 }
		
		 for (int i=5;i<=7;i++) {
				arr2[i] = arr1[i-5];
				}
		 
		 
		 System.out.println(Arrays.toString(arr1));
		 System.out.println(Arrays.toString(arr2));
		 //System.out.println(Arrays.toString(arr2));
		 
	}
		 
		 /*List<Integer> arr_1 = new ArrayList<Integer>(); 
		 
		 
		//Scanner input = new Scanner(System.in);
		//System.out.println("Enter number");
		 int length = arr2.length;
			for (int i = 0; i < arr1.length; i++) {
				arr2[i+length] =arr1[i];
			}
				System.out.println(arr2);
			
				//System.out.print(" ");
			}*/
			//System.out.print("*");
			//System.out.println();*/
			


	
	                    
		
		
	
	public static void main(String[] args) {
		Javalearn jl = new Javalearn();
		jl.manipulate();
	}

}
