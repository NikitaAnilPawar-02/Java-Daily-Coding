import java.util.Scanner;

class NeonNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int no = sc.nextInt();

        int square = no * no;
        int sum = 0;
        while(square>0){
            int lastdigit = square % 10;
            sum += lastdigit;
            square = square / 10;
        }

        if(sum == no){
            System.out.println(no+" is Neon Number");
        }else{
            System.out.println(no+" is NOT Neon Number");
        }
        sc.close();
    }
}