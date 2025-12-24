import java.util.*;
class HashSetExample{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements do you want?: ");
		int size = sc.nextInt();
	
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i <size;i++){
			System.out.print("Enter Element: ");
			int ele = sc.nextInt();
			set.add(ele);			
		}
		
		set.forEach(v -> System.out.println(v));
	}
}
