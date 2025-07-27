import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class LargestNumberInArrayListUsingBuiltInFunction{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements do you want?: ");
        int size = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<size; i++){
            System.out.print("Enter element: ");
            arrayList.add(sc.nextInt());
        }

        System.out.println("Original Array: ");
        System.out.println(arrayList);
        System.out.println("Largest element in ArrayList: "+Collections.max(arrayList));
        sc.close();
    }
}