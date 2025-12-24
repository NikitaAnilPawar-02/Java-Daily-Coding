import java.util.*;
class LinkedHashSet{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements do you want?: ");
		int size = sc.nextInt();
	
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for(int i=0;i <size;i++){
			System.out.print("Enter Element: ");
			int ele = sc.nextInt();
			set.add(ele);			
		}
		
		set.forEach(v -> System.out.println(v));
	}
}
