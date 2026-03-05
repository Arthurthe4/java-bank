void main() {
    Scanner scanner = new Scanner(System.in);
    Bank bank = new Bank();
    // TEST ACCOUNTS
    BankAccount account = new BankAccount("John Do", 1234);
    bank.addAccount(new BankAccount("Joe1", 1001));
    bank.addAccount(new BankAccount("Joe2", 1002));
    bank.addAccount(new BankAccount("Joe3", 1003));

    //=========================================================
    // NEED TO MAKE IT SO MAIN BANK ACCOUNT LOSE MONEY WHEN TRANSFER
    // NOW CAN ONLY TRANSFER BETWEEN THE ACCOUNT FROM "bank"
    // 05.03.2026
    //=========================================================

    // WHILE WILL RUN IF "running" IS TRUE
    boolean running = true;

    while (running) {
        IO.println("\n1. Check Balance");
        IO.println("2. Deposit");
        IO.println("3. Withdraw");
        IO.println("4. Transfer to Another Account");
        IO.println("5. Exit");
        IO.print("Choose: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1: // PRINT BALANCE
                IO.println("Balance: " + account.getBalance() + "$");
                break;
            case 2: // DEPOSIT AMOUNT
                IO.println("Deposit Amount: ");
                double inn = scanner.nextDouble();
                account.deposit(inn);
                break;
            case 3: // WITHDRAW AMOUNT
                IO.println("Amount Withdraw: ");
                double out = scanner.nextDouble();
                account.withdraw(out);
                break;
            case 4: // TRANSFER TO A DIFFERENT ACCOUNT
                IO.print("From Account: ");
                int fromAcc = scanner.nextInt();

                IO.print("To Account: ");
                int toAcc = scanner.nextInt();

                IO.print("Amount: ");
                double amount = scanner.nextDouble();

                if (bank.transfer(fromAcc, toAcc, amount)) {
                    IO.println("Transfer Successful!");
                } else {
                    IO.println("Transfer Failed!");
                }
                break;
            case 5: // EXIT
                running = false;
                break;

            default:
                IO.println("Invalid");
        }

    }

}

