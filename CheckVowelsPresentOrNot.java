import java.util.Scanner;

class CheckVowelPresentOrNot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        boolean found = false;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                found = true;
            }
        }

        if(found){
            System.out.println("Vowel is present in String");
        }else{
            System.out.println("Vowel is NOT present in String");
        }
    }
    
}