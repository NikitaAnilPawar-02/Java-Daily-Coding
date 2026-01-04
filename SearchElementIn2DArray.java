import java.util.*;
class SearchElementIn2DArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rows do you want?: ");
		int rows = sc.nextInt();
		System.out.print("How many columns do you want?: ");
		int cols = sc.nextInt();
		int arr[][] = new int[rows][cols];

		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				System.out.print("Enter ["+i+ "]["+j+ "] element: ");
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.print("Enter key to search: ");
		int key = sc.nextInt();
	
		boolean isFound = false;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				if(arr[i][j] == key){
					System.out.println("Key found at ["+i+"]["+j+"] th position");
					isFound = true;
				}
			}
		}	
		if(!isFound){
			System.out.println("Key not found");
		}	
	}
}
