import java.util.Scanner;

class AccountNotFoundException extends  RuntimeException{
    AccountNotFoundException(String msg){
        super(msg);
        System.out.println("Invalid account Number!");
    }
}
class InsufficientBalance extends  RuntimeException{
    InsufficientBalance(String msg){
        super(msg);
        System.out.println("Transaction can't be done inorder to maintain minimum balance of $2,500 !");
    }
}
class Account{
    private int accountNumber;
    private String accountHolder;
    private double balance;
    Account(int accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
public class Bank {
    Bank(){
        accounts[0] = new Account(1001,"Alice",5000);
        accounts[1] = new Account(1002,"Bob",10000);
        accounts[2] = new Account(1003,"Charlie",2500);
        accounts[3] = new Account(1004,"David",7000.58);
        accounts[4] = new Account(1005,"Emelie",100000);

    }
    static Account[] accounts = new Account[10];
    public Account findAccount(int accountNumber){
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                return acc;
            }
        }
        throw new AccountNotFoundException("Account not found.");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        while(true){
            try{
                System.out.println("1. Check Balance\n2.Withdraw amount");
                int choice = scanner.nextInt();
                switch(choice){
                    case 1: {
                        System.out.print("Enter your account number: ");
                        int accNumber = scanner.nextInt();
                        Account account = bank.findAccount(accNumber);
                        System.out.println("Welcome, " + account.getAccountHolder());
                        System.out.println("Your balance is: $" + account.getBalance());
                        break;
                    }
                    case 2: {
                        System.out.print("Enter your account number: ");
                        int accNumber = scanner.nextInt();
                        Account account = bank.findAccount(accNumber);
                        System.out.println("Enter amount to withdraw: $");
                        double withdraw = scanner.nextDouble();
                        if(account.getBalance()-withdraw>=2500){
                            account.setBalance(account.getBalance()-withdraw);
                            System.out.println("Transaction successful");
                            System.out.println("Your balance is: $" + account.getBalance());
                        }
                        else {
                            throw new InsufficientBalance("Balance less than 2500.");
                        }
                        break;
                    }
                    case 3: System.exit(0);
                    default: System.out.println("Invalid choice");
                }
            }
            catch(Exception e){
                System.out.println("Please try again!");
                }
            }
        }
    }
