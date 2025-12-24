import java.util.*;
class TreeSetExample{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many elements do you want?: ");
		int size = sc.nextInt();

		TreeSet<Integer> set = new TreeSet<>();
		TreeSet<Integer> descSet = new TreeSet<>((a,b)-> b-a);

		for(int i=0; i<size; i++){
			System.out.print("Enter element: ");
			int ele = sc.nextInt();
			set.add(ele);
			descSet.add(ele);
		}
		
		System.out.println("Ascending order: ");
		set.forEach( ele -> System.out.println(ele));
		System.out.println("Descending order: ");
		descSet.forEach( ele -> System.out.println(ele));
	}
}
