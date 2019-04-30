
public class Mat_Mult {

	public static void main(String args[]) {
		int[][] m1 = { 
						{ 1, 2 }, 
						{ 3, 4 } 
					};
		int[][] m2 = { 
						{ 5, 6 }, 
						{ 7, 8 } 
					};
		int[][] m3 = new int[2][2];
		
		
		for(int i=0; i<2; i++) {
			String x = "";
			for(int j=0; j<2; j++) {
				for(int k=0; k<2; k++) {
					m3[i][j] = m3[i][j] + m1[i][k]* m2[k][j];
				}
				x =  x + m3[i][j] + " ";	
			
			}
			System.out.println(x);
		}
		 
	}

}
