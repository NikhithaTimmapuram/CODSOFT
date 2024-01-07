package AtmInterface;
import java.util.Scanner;

public class ATM {

    private static Scanner money = new Scanner(System.in);
    private static double balance = 10000; 
    public static void main(String[] args) 
    {
    	int accountNumber = 0;
        if (true) {
            System.out.println("Please Enter your account number:");
            accountNumber = money.nextInt();

            if (accountNumber == 0) {
                System.out.println("Your account number is Invalid.Please try again.");
              
            }

            System.out.println("Please Enter your PIN:");
            int pin = money.nextInt();

            if (pin == 0) {
                System.out.println("Your PIN is Invalid. Please try again.");
               
            }
            System.out.println("Welcome to the ATM!");
           
        }
        while (true) {
            showMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private static void showMenu() {
        System.out.println("\nSteps:");
        System.out.println("1. Display The Remaining Balance");
        System.out.println("2. Deposit The Money");
        System.out.println("3. Withdrawl Of Money");
        System.out.println("4. Exit The Atm");
    }

    private static int getUserChoice() {
        System.out.print("Please Pick your choice: ");
        return money.nextInt();
    }

    private static void checkBalance() {
        System.out.println("Your current remaining balance in the account is: $" + balance);
    }

    private static void deposit() {
        System.out.print("Enter the amount to deposit in the account: $");
        double amount = money.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("your amount is Deposited in the  account successfully. Your Current  balance in the account is : $" + balance);
        } else {
            System.out.println("Your amount can't be deposited.");
        }
    }

    private static void withdraw() {
        System.out.print("Enter the withdrawal amount from the account: $");
        double amount = money.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of amount was done successfuly.  Your Cureent  balance in the account is: $" + balance);
        } else {
            System.out.println("Your amount can't be withdrawed or insufficient money.");
        }
    }
    private static void exit() {
        System.out.println("Thank you for using the ATM.\n");
        System.out.println("Have a nice Day!,Goodbye.");
        System.exit(0);
     }
        
}
    
    
    

