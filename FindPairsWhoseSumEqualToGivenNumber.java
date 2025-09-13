import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class FindPairsWhoseSumEqualToGivenNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter sum: ");
		int sumToCheck = sc.nextInt();

		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(2,3,4,6,1,5));
		System.out.println(arrayList);

		for(int i=0; i<arrayList.size();i++){
			for(int j=i+1; j<arrayList.size();j++ ){
				if(arrayList.get(i)+arrayList.get(j) == sumToCheck){
					System.out.println("["+arrayList.get(i)+","+arrayList.get(j)+"]");
				}
			}
		}
		sc.close();
	}
}
