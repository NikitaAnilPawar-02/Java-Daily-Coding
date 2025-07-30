import java.util.Scanner;

class LargestNumberInArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many elements do you want?: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }

        int max = arr[0];
        for(int i=0; i<size ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("\nLargest Element in array: "+max);     
        
    }
}