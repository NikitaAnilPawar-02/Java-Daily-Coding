import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class ListofStudentNames{
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		ArrayList<String> studNames = new ArrayList<>();
		for(int i=1; i<=5; i++){
			System.out.print("Enter Student Name: ");
			studNames.add(sc.nextLine());
		}

		System.out.println("--------------------------------");
		Iterator<String> names = studNames.iterator();
		while(names.hasNext()){
			String name = names.next();
			System.out.println("Student Name: "+name);
		}
	}
}