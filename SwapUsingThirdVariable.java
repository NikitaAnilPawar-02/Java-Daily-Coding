import java.util.*;
class SwapUsingThirdVariable{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println("Before Swapping: ");
        System.out.println("First Number: "+a);
        System.out.println("Second Number: "+b);
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After Swapping: ");
        System.out.println("First Number: "+a);
        System.out.println("Second Number: "+b);
    }
}