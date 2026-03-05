public class BankAccount {
    private String owner;
    private double balance;
    private int accountNumber;

    // GOES TO BANK CLASS
    public int getAccountNumber() {
        return accountNumber;
    }

    public BankAccount(String owner, int accountNumber) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = 124; // THE AMOUNT FOR
    }

    // DEPOSIT AMOUNT
    public boolean deposit(double amount) {
        // check if amount is less or = to 0.
        if(amount <= 0) {
            return false;
        }

        balance += amount;
        return true;
    }

    // WITHDRAW AMOUNT
    public boolean withdraw (double amount) {
        // check if amount is less or = to 0 or amount is greater than the Balance on the account.
        if(amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    // CHECK BALANCE
    public double getBalance() {
        return balance;
    }
}
