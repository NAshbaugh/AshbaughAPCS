import java.util.Scanner;

class ValidationUtils {
    public static void main(String args[]) {
        System.out.print("Enter a string: ");
        Scanner scan = new Scanner(System.in);
        if(isValidString(scan)) {
            System.out.println("String Success!");
        }
        else {
            System.out.println("String Failure!");
        }
        
        System.out.print("Enter an integer: ");
        scan = new Scanner(System.in);
        if(isValidInt(scan)) {
            System.out.println("Int Success!");
        }
        else {
            System.out.println("Int Failure!");
        }
        
        System.out.println("Enter a double: ");
        scan = new Scanner(System.in);
        if(isValidDouble(scan)) {
            System.out.println("Double Success!");
        }
        else {
            System.out.println("Double Failure!");
        }
        
        System.out.println("Enter a Bool (T/F): ");
        scan = new Scanner(System.in);
        if(isValidBool(scan)) {
            System.out.println("Boolean Success!");
        }
        else {
            System.out.println("Boolean Failure!");
        }
    }
    
   
    public static Boolean isValidString(Scanner scan) {
        try {
            String s = scan.nextLine();
        }
        catch(Exception e) {
            return false; //An error was raised. The user input could not be read as a String.
        }
        return true; //No error was raised. The scanner read it successfully as a String.
    }

    public static Boolean isValidInt(Scanner scan) {
        try {
            int s = scan.nextInt();
        }
        catch(Exception e) {
            return false;
        }
        return true; 
    }

    public static Boolean isValidDouble(Scanner scan) {
        try {
            Double s = scan.nextDouble();
        }
        catch(Exception e) {
            return false; 
        }
        return true; 
    }

    public static Boolean isValidBool(Scanner scan) {
        String s = scan.nextLine();
        return (
            s.toLowerCase().equals("T")||
            s.toLowerCase().equals("t")||
            s.toLowerCase().equals("F")||
            s.toLowerCase().equals("f")||
            s.toLowerCase().equals("True")||
            s.toLowerCase().equals("False")||
            s.toLowerCase().equals("true")||
            s.toLowerCase().equals("false"));
    }


}

