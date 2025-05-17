import java.sql.SQLOutput;
import java.util.Scanner;

public class Banking {
    static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){


        double balance=15.07;
        boolean isRunning=true;
        int choice;
        double withdrawAmount;

        while(isRunning){
            System.out.println("****************");
            System.out.println("Banking Program");
            System.out.println("****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. EXIT");
            System.out.println("****************");

            System.out.println("Enter your Choice (1-4)>>");
            choice = scanner.nextInt();
            switch(choice) {
                case 1 -> showBalance(balance);
                case 2 -> {
                    balance += deposit();
                    System.out.println("Your Total Balance now is: $"+balance);
                }
                case 3 -> {
                        withdrawAmount = withdraw(balance);
                        balance -= withdrawAmount;
                        System.out.printf("You Withdraw : $%.2f\n", withdrawAmount);
                        System.out.printf("Your Balance now is : $%.2f\n", balance);
                }
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID　CHOICE");
            }
            System.out.println("**************************");
            System.out.println("Thank you have a Great day");
            System.out.println("**************************");
        }


        scanner.close();
    }
    static void showBalance(double balance){
        System.out.printf("Your Balance is $%.2f\n", balance);
    }
    static double deposit(){
        double amount;
        System.out.println("Enter amount you want to Deposit");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
    static double withdraw(double balance){
        System.out.println("Enter amount you want to Withdraw");
        double amount = scanner.nextDouble();

        if(amount > balance) {
            System.out.println("Insufficient Balance");
            System.out.println("Try Again");
            return 0;
        }
        else{
            return amount;
        }
    }
}