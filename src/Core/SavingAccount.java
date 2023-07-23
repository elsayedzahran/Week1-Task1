package Core;

public class SavingAccount extends Account{
    private static double InterestRate = 10;

    public SavingAccount(Account account, double interestRate) {
        super(account.getAccountNumber(), account.getAccountHolderName(), account.getBalance());
        InterestRate = interestRate;
    }
    public SavingAccount(Account account) {
        super(account.getAccountNumber(), account.getAccountHolderName(), account.getBalance());
    }

    public void calculateInterestRate(){

        double MoneyAmount =(InterestRate / 100) * getBalance();
        double finalValue = MoneyAmount + getBalance();
        System.out.println("Successful Operation Mr/Ms - " + getAccountHolderName() +
                "\nYour Balance After Calculating InterestRate = " + finalValue);
    }
}
