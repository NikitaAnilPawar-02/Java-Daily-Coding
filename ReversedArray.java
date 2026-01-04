import java.util.*;
class ReversedArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements do you want?: ");	
		int size = sc.nextInt();
		
		int arr[] = new int[size];

		for(int i=0; i<size; i++){
			System.out.print("Enter element: ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Array: ");
		for(int i=0; i<size; i++){
			System.out.print(arr[i]+" ");
		}
		
		System.out.print("Reversed array: ");
		int start = 0; 
		int end = size - 1;
	
		while(start< end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;	
			start++;
			end--;		
		}

		for(int i=0; i<size; i++){
			System.out.print(arr[i]+" ");
		}

	}
}
