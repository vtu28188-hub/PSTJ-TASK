import java.util.*;

class BankAccount {
    private final int accountNumber;
    private final String holderName;
    private double balance;
    private final List<String> transactions;

    public BankAccount(int accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();

        transactions.add("Account created with balance: " + initialBalance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }

        balance += amount;
        transactions.add("Deposited: " + amount);
        System.out.println("Deposit successful.");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }

        balance -= amount;
        transactions.add("Withdrawn: " + amount);
        System.out.println("Withdrawal successful.");
    }

    public void displayBalance() {
        System.out.printf("Current Balance: %.2f%n", balance);
    }

    public void displayDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
        System.out.printf("Balance: %.2f%n", balance);
    }

    public void displayTransactions() {
        System.out.println("\n--- Transaction History ---");

        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }
}

public class BankingTransactionSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount account =
                new BankAccount(accountNumber, name, initialBalance);

        int choice;

        do {
            System.out.println("\n===== BANKING TRANSACTION SYSTEM =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = sc.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;

                case 3:
                    account.displayBalance();
                    break;

                case 4:
                    account.displayDetails();
                    break;

                case 5:
                    account.displayTransactions();
                    break;

                case 6:
                    System.out.println("Thank you for using the Banking System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}



Enter Account Number: 101
Enter Account Holder Name: Mary
Enter Initial Balance: 5000

===== BANKING TRANSACTION SYSTEM =====
1. Deposit
2. Withdraw
3. Check Balance
4. Account Details
5. Transaction History
6. Exit
Enter your choice: 3
Current Balance: 5000.00

===== BANKING TRANSACTION SYSTEM =====
1. Deposit
2. Withdraw
3. Check Balance
4. Account Details
5. Transaction History
6. Exit
Enter your choice: 1
Enter deposit amount: 3000
Deposit successful.

===== BANKING TRANSACTION SYSTEM =====
1. Deposit
2. Withdraw
3. Check Balance
4. Account Details
5. Transaction History
6. Exit
Enter your choice: 2
Enter withdrawal amount: 1000
Withdrawal successful.

===== BANKING TRANSACTION SYSTEM =====
1. Deposit
2. Withdraw
3. Check Balance
4. Account Details
5. Transaction History
6. Exit
Enter your choice: 3
Current Balance: 7000.00

===== BANKING TRANSACTION SYSTEM =====
1. Deposit
2. Withdraw
3. Check Balance
4. Account Details
5. Transaction History
6. Exit
Enter your choice: 6
Thank you for using the Banking System.
