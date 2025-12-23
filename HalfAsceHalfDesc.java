import java.util.*;
class HalfAsceHalfDesc{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements do you want?: ");
		int size = sc.nextInt();
		int arr[] = new int[size];

		for(int i=0; i<size; i++){
			System.out.print("Enter "+(i+1)+" Element: ");
			arr[i] = sc.nextInt();
		}
		
		int mid = size / 2;
	
		Arrays.sort(arr,0,mid);
		Arrays.sort(arr,mid,size);
		
		int start = mid;
		int end = size-1;
		while(start<end){
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
