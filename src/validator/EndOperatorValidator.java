package validator;

import check.CharacterCheck;

import static exception.ErrorMessage.INVALID_OPERATE;

public class EndOperatorValidator implements Validator {

    @Override
    public void validate(String input) {
        char current = input.charAt(input.length() - 1);
        if(!CharacterCheck.isOperator(current)) {
            throw new IllegalArgumentException(INVALID_OPERATE.getMessage());
        }
    }
}
