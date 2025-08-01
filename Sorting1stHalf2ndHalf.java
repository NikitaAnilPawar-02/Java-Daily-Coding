import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Sorting1stHalf2ndHalf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements do you want?: ");
		int no = sc.nextInt();
		
		int arr[] = new int[no];

		for(int i=0; i<no; i++){
			System.out.print("Enter Element: ");
			arr[i] = sc.nextInt();
		}

		int mid = no / 2;

		Arrays.sort(arr, 0, mid);
		Arrays.sort(arr, mid, no);

		for(int i = mid; i<no; i++){
			for(int j= i+1; j<no; j++){
				if(arr[i]<arr[j]){
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
			}
		}

        System.out.println("Sorting first half in ascending order and the second in descending order: ");
		for(int i=0; i<no; i++){
			System.out.print(arr[i]+" ");;
		}
		sc.close();
	}
}