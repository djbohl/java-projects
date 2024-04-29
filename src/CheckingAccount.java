public class CheckingAccount extends BankAccount{
    private int checkNumber = 1;

    public CheckingAccount(String firstName, String lastName, int age, String address) {
        super(firstName, lastName, age, address);
    }

    public CheckingAccount(String firstName, String lastName, int age, String address, double balance) {
        super(firstName, lastName, age, address, balance);
    }

    public void writeCheck(double amount) {
        System.out.println("Writing check #" + checkNumber + " for $" + amount);
        if(getBalance() < amount) {
            super.chargeOverdraftFee();
        } else {
            withdraw(amount);
        }
        checkNumber ++;
    }
}
