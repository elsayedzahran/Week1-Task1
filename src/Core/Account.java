package Core;

public class Account {
    private final int AccountNumber;
    private String AccountHolderName;
    private double Balance;

    public Account(int accountNumber, String accountHolderName) {
        AccountNumber = accountNumber;
        AccountHolderName = accountHolderName;
        Balance = 0;
    }
    public Account(int accountNumber, String accountHolderName, double balance) {
        AccountNumber = accountNumber;
        AccountHolderName = accountHolderName;
        Balance = balance;
    }

    public void deposit(double money){
        if (money >= 0){
            Balance += money;
            System.out.println("Successful Operation and your new Balance equal " + Balance);
        }
        else{
            System.out.println("Unsuccessful Operation You Entered Number Lower Than 0");
        }
    }
    public void withdraw(double money){
        if (money >= 0 && money <= Balance){
            Balance -= money;
            System.out.println("Successful Operation and your new Balance equal " + Balance);
        }
        else{
            System.out.println("Unsuccessful Operation You Entered Number Lower Than 0\n Or Your Amount You Entered is More than Your Balance.");
        }
    }
    public int getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return Balance;
    }
    public String getAccountHolderName() {
        return AccountHolderName;
    }
}
