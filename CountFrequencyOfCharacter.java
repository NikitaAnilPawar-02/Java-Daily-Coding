import java.util.*;

class CountFrequencyOfCharacter{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.nextLine();
        String newString = str.replaceAll("\\s+", "");
		char charArray[] = newString.toCharArray();

		LinkedHashMap<Character,Integer> list = new LinkedHashMap<>();
        for(int i=0; i<charArray.length; i++){
            char ch = charArray[i];
            if(list.containsKey(ch)){
                list.put(ch,list.get(ch)+1);
            }else{
                list.put(ch,1);
            }
        }

        for (Map.Entry<Character,Integer> entry : list.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
		sc.close();
	}
}