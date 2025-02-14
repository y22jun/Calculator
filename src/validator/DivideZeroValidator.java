package validator;

import static exception.ErrorMessage.DIVIDE_NOT_ZERO;

public class DivideZeroValidator implements Validator {

    @Override
    public void validate(String input) {
        for(int i = 0; i < input.length() - 1; i++) {
            if(input.charAt(i) == '0') {
                throw new IllegalArgumentException(DIVIDE_NOT_ZERO.getMessage());
            }
        }
    }
}
