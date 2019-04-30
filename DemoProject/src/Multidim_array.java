import java.util.StringTokenizer;

public class Multidim_array {

	public static void main(String[] args) {
	int [][] a = {{1,2,3,4,5},{1,2,3,4,5}};
	int [][] b = {{3,5,3,4,5},{8,9,3,4,5}};
	int c[][] = new int [5][5];

	for(int i=0;i<5;i++) {
	for(int j=0;j<5;j++) {
	c[i][j] = a[i][j] + b[i][j];
	System.out.println(c[i][j]);
	}
	System.out.println();
	}

	}


}
