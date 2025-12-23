import java.util.*;
class FrequencyofCharacters{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		
		HashMap<Character,Integer> freq = new HashMap<>();
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			freq.put(ch,freq.getOrDefault(ch,0)+1);
		}

		for(Map.Entry<Character,Integer> i : freq.entrySet()){
			System.out.println(i.getKey()+" "+i.getValue());
		}
	}
}
