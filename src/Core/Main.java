package Core;

import Services.IOperationServices;
import Services.OperationServices;
import Services.ValidationServices;
import Services.IValidationServices;
public class Main {
    public static void main(String[] args) {
        //ValidationServices services = new ValidationServices();
        IValidationServices validation = new ValidationServices();
        IOperationServices operation = new OperationServices();
        Bank bank = new Bank();
        while (true){
            System.out.println("------------------------------------------");
            System.out.println("------------------------------------------\n");
            System.out.println("Hello !!!!");
            System.out.println("Please Select An option To continue:");
            System.out.println("To Add new Account Enter 1");
            System.out.println("To Deposit Money Enter 2");
            System.out.println("To Withdrew Money Enter 3");
            System.out.println("To Calculate Balance After InterestRate Enter 4");
            System.out.println("To Display Balance Enter 5");
            System.out.println("To Exit Program Enter any other Button");

            String choiceString = operation.getInput("Enter Your Choice : ");
            if (validation.isNumber(choiceString, "The Program Will Exit --------------------")){
                int choice = validation.getNumber(choiceString);
                if (choice >= 1 && choice <= 5){
                    RedirectToTask(choice, bank, validation, operation);
                }else {
                    System.out.println("The Program Will Exit --------------------");
                    break;
                }
            }
            else {
                break;
            }
        }

    }
    public static void RedirectToTask(int choice, Bank bank, IValidationServices validation, IOperationServices operation){
        if (choice == 1){
            operation.addAccount(bank, validation);
        }
        else if (choice == 2){
            operation.depositMoney(bank, validation);
        }
        else if (choice == 3){
            operation.withdrewMoney(bank, validation);
        }
        else if (choice == 4){
            operation.calculateBalanceAfterInterestRate(bank, validation);
        }
        else if (choice == 5){
            operation.displayBalance(bank, validation);
        }

    }

}