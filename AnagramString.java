import java.util.Arrays;
import java.util.Scanner;

class AnagramString{

    public static boolean isAnagram(String str1, String str2){
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String: ");
        String str1 = sc.nextLine().replaceAll("\\s+", "");
        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine().replaceAll("\\s+", "");

        if(isAnagram(str1, str2)){
            System.out.println("Anagram String");
        }else{
            System.out.println("NOT Anagram String");
        }
        sc.close();
    }
}