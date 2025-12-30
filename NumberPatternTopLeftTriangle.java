import java.util.*;
class NumberPatternTopLeftTriangle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rows do you want?: ");
		int rows = sc.nextInt();
		System.out.print("How many columns do you want?: ");
		int cols = sc.nextInt();
		
		
		for(int i=1; i<=rows; i++){
			int no = 1;
			for(int j=cols; j>=i; j--){
				System.out.print(no+" ");
				no++;
			}
			System.out.println();
		}
	}
}
