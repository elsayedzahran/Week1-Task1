package Services;

import Services.IValidationServices;

public class ValidationServices implements IValidationServices {

    @Override
    public boolean isNumber(String input, String errorMessage) {
        try {
            int num = Integer.parseInt(input);
            return true;
        }catch (NumberFormatException e){
            System.out.println(e);
            return false;
        }
    }

    @Override
    public int getNumber(String input){

        return Integer.parseInt(input);
    }
}
