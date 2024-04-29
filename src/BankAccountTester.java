public class BankAccountTester
{
    public static void main(String[] args)
    {
        SavingsAccount jerrysAccount = new SavingsAccount("Jerry", "Seinfeld", 36, "129 West 81st Street, NYC");
        CheckingAccount elainesAccount = new CheckingAccount("Elaine", "Benes", 30, "16 West 75th Street, NYC", 2000);
        SavingsAccount georgesAccount = new SavingsAccount("George", "Costanza", 32, "1344 Queens Boulevard, NYC", 600);

        System.out.println("JERRY'S ORIGINAL ACCOUNT");
        System.out.println(jerrysAccount);

        System.out.println("\nELAINE'S ORIGINAL ACCOUNT");
        System.out.println(elainesAccount);

        System.out.println("\nGEORGE'S ORIGINAL ACCOUNT");
        System.out.println(georgesAccount);

        jerrysAccount.deposit(12);
        System.out.println("\nJERRY'S ACCOUNT AFTER DEPOSITING $12");
        System.out.println(jerrysAccount);
        System.out.println();

        jerrysAccount.withdraw(500);
        System.out.println("\nJERRY'S ACCOUNT AFTER TRYING TO WITHDRAW $500");
        System.out.println(jerrysAccount);

        elainesAccount.transfer(1000, jerrysAccount);
        System.out.println("\nJERRY'S ACCOUNT AFTER RECEIVING $1000 FROM ELAINE");
        System.out.println(jerrysAccount);
        System.out.println("\nELAINE'S ACCOUNT AFTER GIVING $1000 TO JERRY");
        System.out.println(elainesAccount);

        jerrysAccount.addInterest();
        System.out.println("\nJERRY'S ACCOUNT AFTER GETTING INTEREST");
        System.out.println(jerrysAccount);
        System.out.println();


        elainesAccount.writeCheck(500);
        System.out.println("\nELAINE'S ACCOUNT AFTER WRITING CHECK FOR $500");
        System.out.println(elainesAccount);
        System.out.println();

        elainesAccount.writeCheck(2000);
        System.out.println("\nELAINE'S ACCOUNT AFTER TRYING TO WRITE CHECK FOR $2000");
        System.out.println(elainesAccount);

        georgesAccount.addInterest();
        System.out.println("\nGEORGE'S ACCOUNT AFTER GETTING INTEREST");
        System.out.println(georgesAccount);
        System.out.println();

        georgesAccount.transfer(1000, georgesAccount);

        System.out.println("\nJERRY'S FINAL ACCOUNT");
        System.out.println(jerrysAccount);

        System.out.println("\nELAINE'S FINAL ACCOUNT");
        System.out.println(elainesAccount);

        System.out.println("\nGEORGE'S FINAL ACCOUNT");
        System.out.println(georgesAccount);
    }
}