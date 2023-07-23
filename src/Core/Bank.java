package Core;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> Accounts;


    public Bank() {
        Accounts = new ArrayList<>();
    }
    public void AddAccount(Account account){
        Account validateAccount = findAccount(account.getAccountNumber());
        if (validateAccount == null) {
            Accounts.add(account);
            System.out.println("Account for Mr/Ms - " + account.getAccountHolderName() + " Added Successfully.");
        }
        else{
            System.out.printf("There Is Another Account with The Same AccountNumber");
        }
    }

    private Account findAccount(int AccountNumber) {
        for (Account account : Accounts) {
            if (account.getAccountNumber() == AccountNumber) {
                return account;
            }
        }
        return null;
    }
    public void deposit(int AccountNumber, double money) {
        Account account = findAccount(AccountNumber);
        if (account != null) {
            account.deposit(money);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(int AccountNumber, double amount) {
        Account account = findAccount(AccountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void displayBalance(int AccountNumber) {
        Account account = findAccount(AccountNumber);
        if (account != null) {
            System.out.println("Account Holder: " + account.getAccountHolderName() +
                    "\nHas Balance equal " + account.getBalance() );

        } else {
            System.out.println("Account not found.");
        }
    }
    public void CalculatingInterestRateForAccount(int AccountNumber) {
        Account account = findAccount(AccountNumber);
        if (account != null) {
            SavingAccount savingAccount = new SavingAccount(account);
            savingAccount.calculateInterestRate();
        } else {
            System.out.println("Account not found.");
        }
    }
}
