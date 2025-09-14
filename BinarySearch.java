import java.util.*;
class BinarySearch{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.print("Enter element to search: ");
		int key = sc.nextInt();
		int low = 0;
		int high = arr.length - 1;
		boolean isFound= false;

		while(low<=high){
			int mid = ( low + high ) / 2;
			if(key == arr[mid]){
				System.out.println("Found at "+ mid + " position");
				isFound = true;
				break;
			}else if(key < arr[mid]){
				high = mid - 1;
			}else if(key > arr[mid]){
				low = mid + 1;
			}
		}

		if(!isFound){
			System.out.println("Found NOTT");
		}

	}
}
