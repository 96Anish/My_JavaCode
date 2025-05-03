import java.util.Scanner;
class Bank {
    protected double balance; 
    public Bank(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs. " + amount);
        System.out.println("New Balance: Rs. " + balance);
    }
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: Rs. " + amount);
        System.out.println("New Balance: Rs. " + balance);
    }
}
class CustAccount extends Bank {   
    public CustAccount(double balance) {
        super(balance);
    }
    @Override
    public void withdraw(double amount) {
        if (balance - amount < 250) {
            System.out.println("Withdrawal failed! Minimum balance of Rs. 250 must be maintained.");
        } else {
            super.withdraw(amount);
        }
    }
}
public class BankAccountTest {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();  
        CustAccount account = new CustAccount(initialBalance);
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
    }
}
