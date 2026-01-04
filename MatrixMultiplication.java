import java.util.*;
class MatrixMultiplication{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("For matrix 1: ");
		System.out.print("How many rows do you want?: ");
		int rows1 = sc.nextInt();
		System.out.print("How many columns do you want?: ");
		int cols1 = sc.nextInt();
		int matrix1[][] = new int[rows1][cols1];
		for(int i=0; i<rows1; i++){
			for(int j=0; j<cols1; j++){
				System.out.print("Enter ["+i+ "]["+j+ "] element: ");
				matrix1[i][j] = sc.nextInt();
			}
		}

		System.out.println("For matrix 2: ");
		System.out.print("How many rows do you want?: ");
		int rows2 = sc.nextInt();
		System.out.print("How many columns do you want?: ");
		int cols2 = sc.nextInt();
		int matrix2[][] = new int[rows2][cols2];
		for(int i=0; i<rows2; i++){
			for(int j=0; j<cols2; j++){
				System.out.print("Enter ["+i+ "]["+j+ "] element: ");
				matrix2[i][j] = sc.nextInt();
			}
		}

		System.out.println("---------------Matrix 1:---------------");
		for(int i=0; i<rows1; i++){
			for(int j=0; j<cols1; j++){
				System.out.print(matrix1[i][j]+ " ");
			}
			System.out.println();
		}

		System.out.println("---------------Matrix 2:---------------");
		for(int i=0; i<rows2; i++){
			for(int j=0; j<cols2; j++){
				System.out.print(matrix2[i][j]+ " ");
			}
			System.out.println();
		}
		
		if (cols1 != rows2) {
    			System.out.println("Matrix multiplication not possible");
    			return;
		}

		int multiMatrix[][] = new int[rows1][cols2];
		for(int i=0; i<rows1; i++){
			for(int j=0; j<cols2; j++){
				for(int k=0; k< cols1; k++){
					multiMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

		System.out.println("---------------Multiplication Matrix :---------------");
		for(int i=0; i<multiMatrix.length; i++){
			for(int j=0; j<multiMatrix[0].length; j++){
				System.out.print(multiMatrix[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
