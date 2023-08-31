import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner ( System.in );
    }
}
class BankAccount{
    int balance;
    int previousTransaction;

    void deposit(int amount){
        if ( amount != 0 ){
            balance = balance+ amount;
            previousTransaction = amount;
        }
    }
    void withdraw(int amount){
        if(amount != 0){
            balance = balance - amount;
            previousTransaction = -amount;
        }

    }
}
