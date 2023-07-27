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
        String ErrorMessage = "You Entered Invalid AccountNumber in the field and The Program Will Restart!!!!";
        if (validation.isNumber(AccountNumbers, ErrorMessage)){
            bank.displayBalance(validation.getNumber(AccountNumbers));
        }
    }

    @Override
    public void calculateBalanceAfterInterestRate(Bank bank, IValidationServices validation) {
        String AccountNumbers = getInput("Please Enter Your AccountNumber: ");
        String ErrorMessage = "You Entered Invalid AccountNumber in the field and The Program Will Restart!!!!";
        if (validation.isNumber(AccountNumbers, ErrorMessage)){
            bank.CalculatingInterestRateForAccount(validation.getNumber(AccountNumbers));
        }
    }

    @Override
    public void withdrewMoney(Bank bank, IValidationServices validation) {
        String AccountNumbers = getInput("Please Enter Your AccountNumber: ");
        String ErrorMessage = "You Entered Invalid AccountNumber in the field and The Program Will Restart!!!!";
        if (validation.isNumber(AccountNumbers, ErrorMessage)){
            String AmountMoney = getInput("Please Enter the Amount Of Money To Withdrew: ");
            String MoneyErrorMessage = "You Entered Invalid Amount Of Money in the field and The Program Will Restart!!!!";
            if (validation.isNumber(AmountMoney, MoneyErrorMessage))
                bank.withdraw(validation.getNumber(AccountNumbers), validation.getNumber(AmountMoney));
        }
    }

    @Override
    public void depositMoney(Bank bank, IValidationServices validation) {
        String AccountNumbers = getInput("Please Enter Your AccountNumber: ");
        String ErrorMessage = "You Entered Invalid AccountNumber in the field and The Program Will Restart!!!!";
        if (validation.isNumber(AccountNumbers, ErrorMessage)){
            String AmountMoney = getInput("Please Enter the Amount Of Money To Deposit: ");
            String MoneyErrorMessage = "You Entered Invalid Amount Of Money in the field and The Program Will Restart!!!!";
            if (validation.isNumber(AmountMoney, MoneyErrorMessage))
                bank.deposit(validation.getNumber(AccountNumbers), validation.getNumber(AmountMoney));
        }
    }

    @Override
    public void addAccount(Bank bank, IValidationServices validation) {
        String AccountNumbers = getInput("Please Enter Your AccountNumber: ");
        String ErrorMessage = "You Entered Invalid AccountNumber in the field and The Program Will Restart!!!!";
        if (validation.isNumber(AccountNumbers, ErrorMessage)){
            String AccountHolderName = getInput("Please Enter Your Name: ");
            Account account = new Account(validation.getNumber(AccountNumbers), AccountHolderName);
            bank.AddAccount(account);
        }
    }
}
