import java.util.*;

class RemoveDuplicatesFromArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements do you want?: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter element: ");
            arr[i]=sc.nextInt();
        }

        System.out.println("Original Array: ");        
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }

        LinkedHashSet<Integer> duplicates = new LinkedHashSet<>();
        for(int ele: arr){
            duplicates.add(ele);
        }

        System.out.println("\nArray after removing Duplicates: ");
        Iterator<Integer> i = duplicates.iterator();
        while(i.hasNext()){
            int value = i.next();
            System.out.print(value+" ");
        }    
        sc.close();
    }
}