package Assignment;

import java.util.Scanner;

public class ATMService {
    Scanner scanner = new Scanner(System.in);
    int userInput;

    public void displayMessagesForInput(){
        System.out.println("What you wanted to do?");
        System.out.println("1. Withdraw Money");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
    }
    
    public void takeInput(){
        userInput = scanner.nextInt();
    }

    public void processRequest(){
        switch (userInput) {
            case 1:
                withdrawCash();
                break;
            case 2: 
                depositCash();
                break;
            case 3:
                displayBalance();
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }
    }

    public void ValidatePin() throws Exception(){
        int pinAttempts = 0;
        while (pinAttempts < ATMVariables.maxPinAttempts) {
            System.out.print("Enter PIN: ");
            int pin = scanner.nextInt();
            if (pin != ATMVariables.CORRECT_PIN){
                pinAttempts++;
                System.out.println("Invalid PIN. Attempts left: " + (ATMVariables.maxPinAttempts - pinAttempts));
            }else{
                return;
            }
        }
        throw new Exception("Card Blocked: 3 incorrect PIN attempts.");
    }

    private void withdrawCash() throws Exception {
        System.out.print("Enter amount to withdraw: ");
        int amount = scanner.nextInt();

        if (amount > ATMVariables.DAILY_LIMIT) {
            throw new Exception("Daily limit exceeded.");
        }
        if (amount > ATMVariables.ACCOUNT_BALANCE) {
            throw new Exception("Insufficient account balance.");
        }
        if (amount > ATMVariables.ATM_TOTAL_MONEY_AVAILABLE) {
            throw new Exception("ATM does not have enough cash.");
        }

        ATMVariables.ACCOUNT_BALANCE -= amount;
        ATMVariables.ATM_TOTAL_MONEY_AVAILABLE -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Remaining Account Balance: " + ATMVariables.ACCOUNT_BALANCE);
    }

    private void depositCash() throws Exception {
        System.out.print("Enter amount to deposit: ");
        int amount = scanner.nextInt();

        if (amount <= 0) {
            throw new Exception("Invalid deposit amount.");
        }

        ATMVariables.ACCOUNT_BALANCE += amount;
        ATMVariables.ATM_TOTAL_MONEY_AVAILABLE += amount;

        System.out.println("Deposited: " + amount);
        System.out.println("Updated Account Balance: " + ATMVariables.ACCOUNT_BALANCE);
    }

    private void displayBalance(){
        System.out.println("Current Account Balance: " + ATMVariables.ACCOUNT_BALANCE);
    }
}
