
public class MatrixMultiplication {

	public static void main(String[] args) {

		int[][] matrix1 = { { 1, 2, 3 }, 
							{ 4, 7, 8 }, 
							{ 9, 8, 7 } };
		int[][] matrix2 = { { 3, 4, 5 }, 
							{ 6, 5, 4 }, 
							{ 7, 6, 5 } };
		int[][] matrix3 = new int[3][3];
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
//matrix3[i][j] = 0;
//				matrix3[i][j] = matrix1[i][j] * matrix2[j][i];
//				System.out.println(matrix3[i][j]);
				for(int k=0; k<3; k++) {
					//System.out.println(matrix2[k][i]);
					//System.out.println(matrix1[i][k]);
					//System.out.println(matrix2[j][k]);
					//System.out.println(matrix2[k][j]);
					matrix3[i][j] =  matrix3[i][j] + matrix1[i][k]* matrix2[k][j];
					
				}
				System.out.println(matrix3[i][j]);		
			}
			

		}

		// TODO Auto-generated method stub

	}

}
