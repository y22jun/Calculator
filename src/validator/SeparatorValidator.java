package validator;

import check.CharacterCheck;

import static exception.ErrorMessage.INVALID_SEPARATOR;

public class SeparatorValidator implements Validator {

    @Override
    public void validate(String input) {
        for(int i = 0; i < input.length() - 2; i++) {
            char current = input.charAt(i);
            if(!Character.isDigit(current) && !CharacterCheck.isSeparator(current) && !CharacterCheck.isWhiteSpace(current)) {
                throw new IllegalArgumentException(INVALID_SEPARATOR.getMessage());
            }
        }
    }
}
