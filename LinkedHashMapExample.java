import java.util.*;
class LinkedHashMapExample{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many elements do you want?: ");
		int size = sc.nextInt();
		
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
		for(int i=0; i<size;i++){
			System.out.print("Enter key: ");
			char k = sc.next().charAt(0);
			System.out.print("Enter Value: ");
			int v = sc.nextInt();
			map.put(k,v);
		}

		System.out.println(map.get('A'));
		System.out.println(map.get('G'));

		for(Map.Entry<Character, Integer> i : map.entrySet()){
			System.out.println("Key: "+i.getKey()+" Value: "+i.getValue());
		}
	}
}
