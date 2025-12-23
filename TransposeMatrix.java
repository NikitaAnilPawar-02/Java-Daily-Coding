import java.util.*;
class TransposeMatrix{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many rows do you want?: ");
		int rows = sc.nextInt();
		System.out.print("Enter how many columns do you want?: ");
		int cols = sc.nextInt();
		
		int matrix[][] = new int[rows][cols];
		for(int i = 0; i<rows; i++){
			for(int j = 0; j<cols; j++){
				System.out.print("Enter "+ (i+1) + " row "+ (j+1)+" col value: ");
				matrix[i][j] = sc.nextInt(); 
			}
			System.out.println();
		} 
		
		System.out.println(":::::Original Matrix:::::");
		for(int i = 0; i<rows; i++){
			for(int j = 0; j<cols; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		} 

		int transpose[][] = new int[cols][rows];
		for(int i = 0; i<rows; i++){
			for(int j = 0; j<cols; j++){
				transpose[j][i] = matrix[i][j];
			}
			System.out.println();
		} 

		System.out.println(":::::Transpose of Matrix:::::");
		for(int i = 0; i<cols; i++){
			for(int j = 0; j<rows; j++){
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		} 
	}
}
