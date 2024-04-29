/**
 * Represents a bank account that can be used to make deposits, withdrawals, and transfers
 */
abstract public class BankAccount
{
    private Client client;      // Client variable that stores information about the owner of the account
    private double balance;     // keeps track of how much money is in the account
    private int accountNumber;  // keeps track of the account number for this account


    private static int nextAccountNumber = 100000;   // static variable that keeps track of the next account number that should be assigned for a new account
    private final double OVERDRAFT_FEE = 25.00;     // constant that keeps track of how much should be charged if a client tries to withdraw more money than they have in the account


    /**
     * First constructor
     * @param  firstName  the first name of the account owner
     * @param  lastName  the last name of the account owner
     * @param  age  the age of the account owner
     * @param  address the address of the account owner
     */
    public BankAccount(String firstName, String lastName, int age, String address)
    {
        // TODO: Initialize all instance variables to appropriate values (balance should be 0) and increment nextAccountNumber
        this.client = new Client(firstName, lastName, age, address);
        this.balance = 0;
        this.accountNumber = nextAccountNumber++;
    }

    /**
     * Second constructor
     * @param  firstName  the first name of the account owner
     * @param  lastName  the last name of the account owner
     * @param  age  the age of the account owner
     * @param  address the address of the account owner
     * @param  balance  the amount to set the balance to in the account
     */
    public BankAccount(String firstName, String lastName, int age, String address, double balance)
    {
        // TODO: Initialize all instance variables to appropriate values and increment nextAccountNumber
        this.client = new Client(firstName, lastName, age, address);
        this.balance = balance;
        this.accountNumber = nextAccountNumber++;
    }

    /**
     * Deposits money to the bank account
     *
     * Precondition:  amount > 0
     * @param  amount  the amount to be deposited
     */
    public void deposit(double amount)
    {
        // TODO: Add the amount to the balance
        balance += amount;
    }

    /**
     * Charges an overdraft fee (or as much of it as possible) from the bank account in the case of insufficient funds for a withdrawal/transfer/check
     */
    public void chargeOverdraftFee()
    {
        // TODO: If there is not enough money in the account to cover the standard overdraft fee, then print a message like the example below
        //  (with the account number and how much of a fee they were charged) and set the balance to 0:
        //  "Not enough money in the account. Account #100000 has been charged an overdraft fee of $12."
        //  Otherwise if there is enough money, deduct the overdraft fee from the balance and display a similar message as above.
        if (balance >= OVERDRAFT_FEE) {
            System.out.println("Not enough money in the account. Account " + accountNumber + " has been charge an overdraft fee of " +
                    OVERDRAFT_FEE + ".");
            balance -= OVERDRAFT_FEE;
        } else {
            System.out.println("Not enough money in the account. Account " + accountNumber + " has been charge an overdraft fee of " +
                    balance + ".");
            balance = 0;
        }
    }

    /**
     * Withdraws money from the bank account
     * Charges an overdraft fee if the amount to be withdrawn is more than the balance in the account
     *
     * Precondition: amount > 0
     * @param  amount  the amount to be withdrawn
     */
    public void withdraw(double amount)
    {
        // TODO: Check if there is enough money in the account to cover the amount withdrawn.
        //  If there is, deduct the amount from the balance.
        //  Otherwise, charge the account an overdraft fee.
        if (amount > balance) {
            chargeOverdraftFee();
        } else {
            balance -= amount;
        }
    }

    /**
     * Transfers money from one bank account to another
     * Charges an overdraft fee if the amount to be transferred is more than the balance in the account
     *
     * @param  amount  the amount of money to be transferred
     * @param  destinationAccount  the account that the amount is being transferred into
     */
    public void transfer(double amount, BankAccount destinationAccount)
    {
        // TODO: If there is enough in the source account to cover the amount
        //  then withdraw the amount from that account and also deposit it to the destinationAccount.
        //  Otherwise, just withdraw the overdraft fee from the source account.
        if (balance < amount) {
            chargeOverdraftFee();
        }
            balance -= amount;
            destinationAccount.balance += amount;
    }

    /**
     * Provides the balance in the account
     *
     * @return  balance  the balance in the account
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     * Displays the account information as a formatted string
     */
    public String toString()
    {
        return "Account #" + accountNumber + "\n" + "Balance $" + balance + "\n" + client;
    }
}