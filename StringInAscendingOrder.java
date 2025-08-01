import java.util.Arrays;
import java.util.Scanner;

class StringInAscendingOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many strings do you want?: ");
		int no = sc.nextInt();
		String str[] = new String[no];

		for(int i=0; i<no; i++){
			System.out.print("Enter String: ");
			str[i] = sc.next();
		}

		Arrays.sort(str);
		 
		for(int i=0; i<no; i++){
			System.out.print(str[i]+" ");
		}
		sc.close();
	}
}