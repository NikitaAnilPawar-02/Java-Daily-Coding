import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

class Student{
	int id, marks;
	String name;
	Student(int id, String name, int marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public static void sortByMarks(ArrayList<Student> list ){
		list.sort(Comparator.comparingInt(s -> s.marks));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many student details do you want to store: ");
		int size = sc.nextInt();

		ArrayList<Student> studentList = new ArrayList<>();

		for(int i=0; i<size; i++){
			System.out.print("Enter student Id: ");
			int id = sc.nextInt();
			System.out.print("Enter student name: ");
			String name = sc.next();
			System.out.print("Enter student marks: ");
			int marks = sc.nextInt();
			studentList.add(new Student(id, name, marks));
			System.out.println("-------------------------");
		}

		System.out.println("Sorted student by marks: ");
		sortByMarks(studentList);
		for (Student s : studentList) {
			System.out.println("Id: "+s.id+" Name: "+s.name+" Marks: "+s.marks);
		}
		
		sc.close();
	}
}