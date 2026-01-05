import java.util.*;

class FirstRepeating{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements do you want to store?: ");
		int size = sc.nextInt();
		int arr[] = new int[size];

		for(int i=0; i<size; i++){
			System.out.print("Enter element: ");
			arr[i] = sc.nextInt();
		}
	
		FirstRepeating obj = new FirstRepeating();
		System.out.print(obj.firstRepeatingElement(arr));
	}
	
	public int firstRepeatingElement(int[] nums){
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i<nums.length; i++){
			if(! set.add(nums[i])){
				return nums[i];
			}
		} 
		return -1;
	}
}
