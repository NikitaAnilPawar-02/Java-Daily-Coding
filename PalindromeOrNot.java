import java.util.*;
class PalindromeOrNot{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int no =sc.nextInt();
		int rev = 0;
		int original = no;
	
		while(no> 0){
			int lastDigit = no % 10;
			rev = rev * 10 + lastDigit;
			no = no / 10;
		}

		if(original == rev){
			System.out.print("Number is Palindrome");
		}else{
			System.out.println("Number is Not a palindrome");
		}
	}
}
