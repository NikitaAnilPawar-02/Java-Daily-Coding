import java.util.ArrayList;
import java.util.Scanner;

class LargestNumberInArrayList{
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

        int max = 0;
        for(int i=0; i<size; i++){
            if(arrayList.get(i) > max){
                max = arrayList.get(i);
            }
        }
        System.out.println("Largest element in ArrayList: "+max);
        sc.close();
    }
}