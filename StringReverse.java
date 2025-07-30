import java.util.*;

class StringReverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.println("Original String: "+str);

        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }

        System.out.println("Reverse String: "+rev);
    }
}