import java.util.Scanner;

class CountVowelsinString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine().toLowerCase();
       
        int count = 0 ;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println("Total count of vowels in string: "+count);
    }
}