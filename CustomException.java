import java.util.*;

class CustomException{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Age: ");
		int age = sc.nextInt();

		try{
			if(age<18){
				throw new InvalidAgeException("Age must be greater than 18");	
			}
			System.out.println("You can vote!!");
		}catch(InvalidAgeException e){
			System.out.println(e);
		}finally{
			System.out.println("Exit");
			sc.close();
		}
	}
}

class InvalidAgeException extends Exception{
	InvalidAgeException(String msg){
		super(msg);
	}
}

