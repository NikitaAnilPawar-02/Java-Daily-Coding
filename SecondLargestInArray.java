import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class SecondLargestInArray {

	public static void main(String[] args) { 
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(12, 32, 123, 31, 42,100));
		for(int i=0; i<arrayList.size(); i++){
			for(int j=i+1; j<arrayList.size();j++){
				if(arrayList.get(i)<arrayList.get(j)){
					int temp = arrayList.get(i);
					arrayList.set(i, arrayList.get(j));
					arrayList.set(j, temp);
				}
			}
		}
		System.out.println("Second largest element: "+arrayList.get(1));
	}
}
