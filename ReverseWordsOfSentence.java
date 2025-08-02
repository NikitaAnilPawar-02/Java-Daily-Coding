import java.util.Scanner;

class ReverseWordsOfSentence{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your String: ");
		String str = sc.nextLine();

		String strArray[] = str.split("\\s+");

		for(int i=strArray.length-1; i>=0; i--){
			System.out.print(strArray[i]+" ");
		}
	}
}