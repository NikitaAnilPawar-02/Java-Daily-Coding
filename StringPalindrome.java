import java.util.Scanner;

class StringPalindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String original = str;

        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }

        if(rev.equals(original)){
            System.out.println(original+" is Palindrome");
        }else{
            System.out.println(original+" is Not Palindrome");
        }
    }
}