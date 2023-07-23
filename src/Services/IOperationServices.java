package Services;
import Core.Bank;

public interface IOperationServices {
    public String getInput(String message);
    public void displayBalance(Bank bank, IValidationServices validation);
    public void calculateBalanceAfterInterestRate(Bank bank,IValidationServices validation);
    public void withdrewMoney(Bank bank,IValidationServices validation);
    public void depositMoney(Bank bank,IValidationServices validation);
    public void addAccount(Bank bank,IValidationServices validation);
}
