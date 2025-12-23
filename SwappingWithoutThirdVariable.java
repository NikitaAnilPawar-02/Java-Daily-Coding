import java.util.*;
class SwappingWithoutThirdVariable{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int no1 = sc.nextInt();
		System.out.print("Enter Second Number: ");
		int no2 = sc.nextInt();
		
		System.out.println("Before Swapping::");
		System.out.println("First Number: "+no1);
		System.out.println("Second Number: "+no2);

		no2 = no1 + no2;
		no1 = no2 - no1;
		no2 = no2 - no1;

		System.out.println("After Swapping::");
		System.out.println("First Number: "+no1);
		System.out.println("Second Number: "+no2);
	}
}
