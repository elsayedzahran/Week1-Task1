package Services;

import Core.Account;
import Core.Bank;

import java.util.Scanner;

public class OperationServices implements IOperationServices {
    Scanner input = new Scanner(System.in);
    @Override
    public String getInput(String message) {
        System.out.println(message);
        String Data = input.next();
        input.nextLine();
        return Data;
    }

    @Override
    public void displayBalance(Bank bank, IValidationServices validation) {
        String AccountNumbers = getInput("Please Enter Your AccountNumber: ");
        if (validation.isNumber(AccountNumbers)){
            bank.displayBalance(validation.getNumber(AccountNumbers));
        }
        else {
            System.out.println("You Entered Invalid AccountNumber in the field and The Program Will Restart!!!!");
        }
    }

    @Override
    public void calculateBalanceAfterInterestRate(Bank bank, IValidationServices validation) {
        String AccountNumbers = getInput("Please Enter Your AccountNumber: ");
        if (validation.isNumber(AccountNumbers)){
            bank.CalculatingInterestRateForAccount(validation.getNumber(AccountNumbers));
        }
        else {
            System.out.println("You Entered Invalid AccountNumber in the field and The Program Will Restart!!!!");
        }
    }

    @Override
    public void withdrewMoney(Bank bank, IValidationServices validation) {
        String AccountNumbers = getInput("Please Enter Your AccountNumber: ");
        if (validation.isNumber(AccountNumbers)){
            String AmountMoney = getInput("Please Enter the Amount Of Money To Withdrew: ");
            if (validation.isNumber(AmountMoney))
                bank.withdraw(validation.getNumber(AccountNumbers), validation.getNumber(AmountMoney));
            else
                System.out.println("You Entered Invalid Amount Of Money in the field and The Program Will Restart!!!!");
        }
        else
            System.out.println("You Entered Invalid AccountNumber in the field and The Program Will Restart!!!!");
    }

    @Override
    public void depositMoney(Bank bank, IValidationServices validation) {
        String AccountNumbers = getInput("Please Enter Your AccountNumber: ");
        if (validation.isNumber(AccountNumbers)){
            String AmountMoney = getInput("Please Enter the Amount Of Money To Deposit: ");

            if (validation.isNumber(AmountMoney))
                bank.deposit(validation.getNumber(AccountNumbers), validation.getNumber(AmountMoney));
            else
                System.out.println("You Entered Invalid Amount Of Money in the field and The Program Will Restart!!!!");
        }
        else
            System.out.println("You Entered Invalid AccountNumber in the field and The Program Will Restart!!!!");
    }

    @Override
    public void addAccount(Bank bank, IValidationServices validation) {
        String AccountNumbers = getInput("Please Enter Your AccountNumber: ");
        if (validation.isNumber(AccountNumbers)){
            String AccountHolderName = getInput("Please Enter Your Name: ");
            Account account = new Account(validation.getNumber(AccountNumbers), AccountHolderName);
            bank.AddAccount(account);
        }
        else {
            System.out.println("You Entered Invalid AccountNumber in the field and The Program Will Restart!!!!");
        }
    }
}
