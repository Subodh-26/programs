import java.util.Scanner;

public class Bank {
    private String accnum;
    private String name;
    private double balance;
    private static final double Min_Balance = 500;

    public void createAccount(String accnum, String name, double initialDeposit) {
        this.accnum = accnum;
        this.name = name;
        if (initialDeposit >= Min_Balance) {
            this.balance = initialDeposit;
        } else {
            System.out.println("Initial deposit must be at least " + Min_Balance);
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited amount: " + amount);
    }

    public void withdraw(double amount) {
        if ((balance - amount) >= Min_Balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal denied. Minimum balance of " + Min_Balance + " must be maintained.");
        }
    }

    void miniStatement() {
        System.out.println("---- Mini Statement ----");
        System.out.println("Account Number: " + accnum);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank account = new Bank();

        // Create account
        System.out.print("Enter Account Number: ");
        String accNumber = scanner.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accName = scanner.nextLine();

        System.out.print("Enter Initial Deposit: ");
        double initialDeposit = scanner.nextDouble();

        account.createAccount(accNumber, accName, initialDeposit);
        int choice;
           do {
               System.out.println("1. Deposit");
               System.out.println("2. Withdraw");
               System.out.println("3. Print Balance Sheet");
               System.out.println("4. Exit");
               System.out.print("Enter your choice: ");
               choice = scanner.nextInt();

               switch (choice) {
                   case 1:
                       System.out.print("Enter amount to deposit: ");
                       double depositAmount = scanner.nextDouble();
                       account.deposit(depositAmount);
                       break;

                   case 2:
                       System.out.print("Enter amount to withdraw: ");
                       double withdrawAmount = scanner.nextDouble();
                       account.withdraw(withdrawAmount);
                       break;

                   case 3:
                       account.miniStatement();
                       break;

                   case 4:
                       System.out.println("Exit");
                       break;

                   default:
                       System.out.println("Invalid choice. Try again.");
               }

           }while(choice!=4);
        scanner.close();
        }
    }


