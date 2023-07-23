package Services;

import Services.IValidationServices;

public class ValidationServices implements IValidationServices {

    @Override
    public boolean isNumber(String input) {
        try {
            int num = Integer.parseInt(input);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public int getNumber(String input){
        return Integer.parseInt(input);
    }
}
