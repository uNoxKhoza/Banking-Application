import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Create a BankAccount object with initial customer name and ID
        BankAccount uNox = new BankAccount("Nox", "15");

        // Display the banking menu to the user
        uNox.showMenu();
    }
}

class BankAccount {
    int balance;                // Current balance of the account
    int previousTransaction;    // Amount of the previous transaction
    String customerName;        // Name of the account holder
    String customerId;          // ID of the account holder

    // Constructor to initialize customer name and ID
    BankAccount(String custname, String custId) {
        customerName = custname;
        customerId = custId;
        this.balance = 500;
    }

    // Method to deposit a specified amount into the account
    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    // Method to withdraw a specified amount from the account
    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    // Method to display the type and amount of the previous transaction
    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction");
        }
    }

    // Method to display the banking menu and perform actions based on user input
    void showMenu() {
        char option = '\0';


        Scanner sc = new Scanner(System.in);

        // Display welcome message along with customer name and ID
        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is " + customerId);
        System.out.println();
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        // Loop to keep displaying the menu until the user chooses to exit
        do {
            System.out.println("==========================");
            System.out.println("Enter the option");
            System.out.println("==========================");
            String answ = sc.next();
//            option = sc.next().charAt(0);
            Character.toLowerCase(option);  // This line does not modify 'option', needs assignment

            // Perform actions based on the user's chosen option
            if (answ.equalsIgnoreCase( "a" )){
                System.out.println("========================");
                System.out.println("Balance is " + balance);
                System.out.println("========================");
                System.out.println();
            }
            else if ( answ.equalsIgnoreCase( "b" )){
                System.out.println("========================");
                System.out.println("Enter the amount to deposit");
                System.out.println("========================");
                int amount = sc.nextInt();
                deposit(amount);
                System.out.println();
            }
            else if ( answ.equalsIgnoreCase( "c" )){
                System.out.println("========================");
                System.out.println("Enter the amount to withdraw");
                System.out.println("========================");
                int amount2 = sc.nextInt();
                withdraw(amount2);
                System.out.println();
            }
            else if ( answ.equalsIgnoreCase( "d" )){
                System.out.println("========================");
                getPreviousTransaction();
                System.out.println("========================");
                System.out.println();
            }
            else if(answ.equalsIgnoreCase( "e" )){
                System.out.println("=========================");
                System.out.println("Thank you!");
            }


        } while (option != 'E');  // Continue looping until 'E' is chosen (Exit)
    }
}










