import java.util.*;
class TreeMapExample{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements do you want?: ");
		int size = sc.nextInt();
	
		TreeMap<Integer,Character> map = new TreeMap<>();
		TreeMap<Integer,Character> revMap = new TreeMap<>(Comparator.reverseOrder());

		for(int i=0; i<size;i++){
			System.out.print("Enter Key: ");
			int k = sc.nextInt();
			System.out.print("Enter Value: ");
			char v = sc.next().charAt(0);
			map.put(k,v);
			revMap.put(k,v);
		}
		
		System.out.println("Ascending Order:: ");
		for(Map.Entry<Integer,Character> entry : map.entrySet()){
			System.out.println("Keys: "+entry.getKey()+" Value: "+entry.getValue());
		}
		
		System.out.println("Descending Order:: ");
		for(Map.Entry<Integer,Character> entry : revMap.entrySet()){
			System.out.println("Keys: "+entry.getKey()+" Value: "+entry.getValue());
		}

		System.out.println("Lower Entry: "+map.lowerEntry(5));
		System.out.println("Higher Entry: "+map.higherEntry(5));
		System.out.println("First Entry: "+map.firstEntry());
		System.out.println("Last Entry: "+map.lastEntry());
		System.out.println("Head Map: "+map.headMap(5));
		System.out.println("Tail Map: "+map.tailMap(5));
		System.out.println("SubMap: "+map.subMap(2,5));
	}
}
