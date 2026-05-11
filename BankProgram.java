import java.util.*;

abstract class BankAccount
{
    int account_no;
    double bank_balance;

    BankAccount(int account_no,double bank_balance)
    {
        this.account_no = account_no;
        this.bank_balance = bank_balance;
    }

    void deposit(double amount)
    {
        bank_balance = bank_balance + amount;

        System.out.println("Deposited Amount : " + amount);
        System.out.println("Updated Balance  : " + bank_balance);
    }

    abstract void withdraw(double amount);

    void display()
    {
        System.out.println("Account Number : " + account_no);
        System.out.println("Bank Balance   : " + bank_balance);
    }
}

// Saving Account
class SavingAccount extends BankAccount
{
    SavingAccount(int account_no,double bank_balance)
    {
        super(account_no,bank_balance);
    }

    void withdraw(double amount)
    {
        if(bank_balance - amount < 1000)
        {
            System.out.println("Minimum balance must be 1000");
        }
        else
        {
            bank_balance = bank_balance - amount;

            System.out.println("Saving Account Withdraw : " + amount);
            System.out.println("Remaining Balance       : " + bank_balance);
        }
    }
}

// Current Account
class CurrentAccount extends BankAccount
{
    CurrentAccount(int account_no,double bank_balance)
    {
        super(account_no,bank_balance);
    }

    void withdraw(double amount)
    {
        if(amount > bank_balance)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            bank_balance = bank_balance - amount;

            System.out.println("Current Account Withdraw : " + amount);
            System.out.println("Remaining Balance        : " + bank_balance);
        }
    }
}

// Main Class
public class BankProgram
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        BankAccount arr[] = new BankAccount[2];

        arr[0] = new SavingAccount(101,10000);
        arr[1] = new CurrentAccount(102,5000);

        int choice, acc;
        double amount;

        while(true)
        {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Display Accounts");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:

                    for(int i=0; i<arr.length; i++)
                    {
                        arr[i].display();
                    }

                    break;

                case 2:

                    System.out.println("Select Account");
                    System.out.println("0. Saving Account");
                    System.out.println("1. Current Account");

                    System.out.print("Enter Choice : ");
                    acc = sc.nextInt();

                    System.out.print("Enter Deposit Amount : ");
                    amount = sc.nextDouble();

                    arr[acc].deposit(amount);

                    break;

                case 3:

                    System.out.println("Select Account");
                    System.out.println("0. Saving Account");
                    System.out.println("1. Current Account");

                    System.out.print("Enter Choice : ");
                    acc = sc.nextInt();

                    System.out.print("Enter Withdraw Amount : ");
                    amount = sc.nextDouble();

                    arr[acc].withdraw(amount);

                    break;

                case 4:

                    System.out.println("Program Ended...");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}