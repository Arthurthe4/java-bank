import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount("John Do", 123456789);

        // while will run if "running" is true
        boolean running = true;

        while(running) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose: " );

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + account.getBalance() + "$");
                    break;
                case 2:
                    System.out.println("Deposit Amount: ");
                    double inn = scanner.nextDouble();
                    account.deposit(inn);
                    break;
                case 3:
                    System.out.println("Amount Withdraw: ");
                    double out = scanner.nextDouble();
                    account.withdraw(out);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid");
            }

        }

    }
}