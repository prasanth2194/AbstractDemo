import java.util.Scanner;

public class User01 extends Exception {
	public User01(String str) {
		
		  System.out.println(str);
		 }
		
		
		 
		 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter age: ");
		  int age = sc.nextInt();
		  
		  try {
		   if(age < 18) 
		    throw new User01("InvalidAgeException");
		   else
		    System.out.println("Valid age");
		  }
		  catch (Exception a) {
		   //System.out.println(a);
		  }
		  finally{
			  System.out.println("user processed");
		 }
		}
}


