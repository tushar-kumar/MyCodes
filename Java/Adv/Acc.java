import java.util.Date;

public class Acc {
    public static void main(String[] args) {
        System.out.println("\nName: TUSHAR KUMAR \t SAP ID: 10000014268");
        Account account = new Account(4728, 550000);
        Account.setAnnualInterestRate(6.5);
        account.withdraw(5500);
        account.deposit(20000);
        System.out.println("Balance is " + account.getBalance());
        System.out.println("Monthly interest is " +
                account.getMonthlyInterest());
        System.out.println("This account was created at " +
                account.getDateCreated());
    }
}

class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    public Account() {
        dateCreated = new Date();
    }

    public Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
        dateCreated = new Date();
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int newId) {
        id = newId;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public static void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 1200);
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}