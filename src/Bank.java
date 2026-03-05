import java.util.ArrayList;
import java.util.List;

public class Bank  {

    // TEST ACCOUNTS LIST
    static List<BankAccount> accounts = new ArrayList<>();

    // ADDED NEW ACCOUNTS
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    // FIND ACCOUNTS
    public static BankAccount findAccount(int accountNumber) {
        for (BankAccount acc : accounts) {
            if(acc.getAccountNumber() == accountNumber) {
                return acc;
            }
        }
        return null;
    }

    // TRANSFER BETWEEN ACCOUNTS
    public boolean transfer(int fromAcc, int toAcc, double amount) {

        BankAccount from = findAccount(fromAcc);
        BankAccount to = findAccount(toAcc);

        if(from == null || to == null) {
            return false;
        }
        if(from.withdraw(amount)) {
            to.deposit(amount);
            return true;
        }
        return false;
    }

}