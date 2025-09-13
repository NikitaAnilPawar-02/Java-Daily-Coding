import java.util.HashMap;
import java.util.Scanner;

class CountOfEachCharacter{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.nextLine();
		HashMap<Character, Integer> result = new HashMap<>();

		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			if(result.containsKey(c)){
				result.put(c, result.get(c)+1);
			}else{
				result.put(c, 1);
			}
		}
		System.out.println(result);
		sc.close();
	}
}
