// Write a program to remove duplicates from an array without using extra space.
import java.util.*;
class RemoveDuplicates{
	public static void main(String args[]){
		int arr[] = {1,2,1,4,2,3,2,5};
		Arrays.sort(arr);

		System.out.print(arr[0]+" ");
		for(int i=1; i<arr.length; i++){
			if(arr[i] != arr[i-1]){
				System.out.print(arr[i]+" ");
			}
		}
	}
}
