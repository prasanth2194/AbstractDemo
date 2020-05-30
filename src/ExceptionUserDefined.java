
import java.util.Scanner;


// This is exception class that has to be defined in its own file
class InvalidAgeException extends Exception {
    
    // Overriding super class constructor to include custom message
    public InvalidAgeException(String message) {
        // This will pass on message to Exception class constructor
        super(message);
    }
}


public class ExceptionUserDefined {
    
    // validation parameters are often declared constants
    // or they are read from a configuration file or database
    private static final int VALID_AGE = 18;

    // main method that throws InvalidAgeException. 
     public static void main(String []args) throws InvalidAgeException{
        
        // Initializing resources to defaults
        Scanner scan = null;
        
        // flag that helps us print in finally block
        boolean isAgeValid = false;
        
        try {
            // start of code that you are taking control of.
            // which means using try
            scan = new Scanner(System.in);
            
            System.out.println("Enter age: ");
            int userAge = scan.nextInt();
            
            // compare age with constant parameter that we set
            if(userAge >= VALID_AGE) {
                isAgeValid = true;
            }
            else {
                throw new InvalidAgeException("Invalid age entered. User age must be greater than or equal to " + VALID_AGE);
            }
        }
        // block that follows try and executes no matter what happens inside a program
        finally {
            
            if(isAgeValid) {
                System.out.println("----> Inside Finally: User age VALID");
            }
            else {
                System.out.println("----> Inside Finally: User age INVALID!");
            }
            
            if(scan != null) {
                scan.close();
            }
        }
     }
}