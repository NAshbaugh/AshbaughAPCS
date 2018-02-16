import java.util.Scanner;

public class LoanCalculator{
    public static int mode = -1;
    public static double loanAmt = -1;
    public static int loanTerm = -1;
    public static double interestRate = -1;

    public static void main(String[] args) {
        //Read in the loan calculation mode
        Scanner scan;
        while(true) { //Loop the mode selection menu until a valid input is provided
            scan = new Scanner(System.in);
            printModeStatement(); //Call a function to print our mode selection statement
            if(scan.hasNextInt()) { //Check if input provided is a valid integer
                mode = scan.nextInt();
                if(0 < mode && mode < 4) { //Check if input provided is 1, 2, or 3
                    break; //Valid input has been provided. Break out of the while loop
                }
            }
            //If it reaches here, the input was invalid. Loop again.
        }
        System.out.println("You selected mode " + mode);

        if(mode == 1) {
            flatInterest();
        }
        else {
            if(mode == 2) {
                compoundingInterestNP();
            }
            else {
                compoundingInterestWP();
                
            }     
        }
    }

    public static void flatInterest() {
        Scanner scan;
        while(true) {
            System.out.println("How much is your loan? ($):");
            scan = new Scanner(System.in);
            if(scan.hasNextDouble()) {
                loanAmt = scan.nextDouble();
                if(0 < loanAmt) {
                    break;
                }
            }
        }
        while(true) {
            System.out.println("How long is your loan period? (years):");
            scan = new Scanner(System.in);
            if(scan.hasNextInt()) {
                loanTerm = scan.nextInt();
                if(0 < loanTerm) {
                    break;
                }
            }
        }
        while(true) {
            System.out.println("What is your given interest rate? (ex. 3.5% = 3.5):");
            scan = new Scanner(System.in);
            if(scan.hasNextDouble()) {
                interestRate = scan.nextDouble();
                if(0 < interestRate) {
                    break;
                }
            }
        }
        double interestPercent = interestRate / 100;
        double interestTotal = interestPercent * loanAmt * loanTerm;
        double loanTotal = interestTotal + loanAmt;
        System.out.println("Original Loan Amount: $" + loanAmt);
        System.out.println("Loan Term: " + loanTerm + " years");
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Accumulated Interest: $" + interestTotal);
        System.out.println("Total Loan Amount: $" + loanTotal);
    }

    public static void compoundingInterestNP() {
        Scanner scan;
        while(true) {
            System.out.println("How much is your loan? ($):");
            scan = new Scanner(System.in);
            if(scan.hasNextDouble()) {
                loanAmt = scan.nextDouble();
                if(0 < loanAmt) {
                    break;
                }
            }
        }
        while(true) {
            System.out.println("How long is your loan period? (years):");
            scan = new Scanner(System.in);
            if(scan.hasNextInt()) {
                loanTerm = scan.nextInt();
                if(0 < loanTerm) {
                    break;
                }
            }
        }
        while(true) {
            System.out.println("What is your given interest rate? (ex. 3.5% = 3.5):");
            scan = new Scanner(System.in);
            if(scan.hasNextDouble()) {
                interestRate = scan.nextDouble();
                if(0 < interestRate) {
                    break;
                }
            }
        }
        double interestPercent = interestRate / 100;
        double ratePerMonth = interestPercent / 12;
        int totalMonths = loanTerm;
        while(true) {
            int monthsRemaining = totalMonths - 1;
            double loanTotal =
            while(monthsRemaining > 0) {
                double monthlyInterest = loanTotal * ratePerMonth;
                double trueLoanTotal = loanTotal + monthlyInterest;
            }
            break;
        if(monthsRemaining <= 0) {
            break;
            }
        }
        
        double totalInterest = trueLoanTotal - loanAmt;
        System.out.println("Original Loan Amount: $" + loanAmt);
        System.out.println("Loan Term: " + loanTerm + " years");
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Accumulated Interest: $" + totalInterest);
        System.out.println("Total Loan Amount: $" + trueLoanTotal);
    }



    public static void printModeStatement() {
        System.out.print(
            "Select an interest calculation mode:\n"
            + "(1) Flat Interest\n"
            + "(2) Compounding Interest Without Monthly Payments\n"
            + "(3) Compounding Interest With Monthly Payments\n"
        );
    }
}