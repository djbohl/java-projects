public class SavingsAccount extends BankAccount{
    private final double INTEREST_RATE = 0.05;

    public SavingsAccount(String firstName, String lastName, int age, String address) {
        super(firstName, lastName, age, address);
    }

    public SavingsAccount(String firstName, String lastName, int age, String address, double balance) {
        super(firstName, lastName, age, address, balance);
    }

    public void addInterest() {
        double interest = getBalance() * INTEREST_RATE;
        deposit(interest);
    }
}
