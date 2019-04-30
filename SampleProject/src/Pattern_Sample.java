
public class Pattern_Sample {

	public Pattern_Sample() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]) {
		
		// value from user
		int count = 9;
		// star count
		int decrement = 1;
		// for space on both sides
		int sideFiller = (count - decrement)/2;
		// output to print
		String output = "";
		
		// code to iterate for count
		for(int i=0; i<=count; i++) {
			// variable for holding the spaces
			String padding = "";
			// astrix
			String star = "";
			// for populating the space padding
			while(sideFiller != 0) {
				padding = padding + " ";
				sideFiller--;
			}
			// for populating the stars
			for(int j=0; j<decrement; j++) {
				star = star + "*";
			}
			
			// appending based on the values
			output = padding + star + padding;
			
			// printing the values
			System.out.println(output);
			
			// break the loop if the decrement is equal to the count
			if(decrement == count) {
				break;
			}
			
			// always the decrement should be an odd number
			decrement = decrement + 2;
			
			// resetting the value for padding on both sides
			sideFiller = (count - decrement)/2;
		}
	}

}
