public class BankAccount {
    private String owner;
    private double balance;
    private int accountNumber;

    public BankAccount(String owner, int accountNumber) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = 24; // the amount on the bank account
    }

    // Deposit Amount
    public boolean deposit(double amount) {
        // check if amount is less or = to 0.
        if(amount <= 0) {
            return false;
        }

        balance += amount;
        return true;
    }

    // Withdraw Amount
    public boolean withdraw (double amount) {
        // check if amount is less or = to 0 or amount is greater than the Balance on the account.
        if(amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    // Just check Balance
    public double getBalance() {
        return balance;
    }
}
