import java.util.*;
class AlphabetPatternLeftTriangle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rows do you want?: ");
		int rows = sc.nextInt();
		System.out.print("How many columns do you want?: ");
		int cols = sc.nextInt();

		char ch = 'A';
		for(int i=1; i<=rows; i++){
			for(int j=1; j<=cols; j++){
				if(i>=j){
					System.out.print(ch+" ");
					ch++;
				}
			}
			System.out.println();
		}

	}
}
