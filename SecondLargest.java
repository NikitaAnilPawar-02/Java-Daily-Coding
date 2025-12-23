import java.util.*;
class SecondLargest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements do you want?: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size;i++){
			System.out.print("Enter element: ");
			arr[i] = sc.nextInt();
		}

		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		for(int i: arr){
			if(i>max){
				secMax = max;
				max = i;
			}else if(i != max && i > secMax){
				secMax = i;
			} 
		}
	
		System.out.println("Second maximum element: "+secMax);
	}
}
