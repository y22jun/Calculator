package validator;

import check.CharacterValidator;

import static exception.ErrorMessage.CONSECUTIVE_SEPARATOR;

public class ConsecutiveSeparatorValidator implements Validator {

    @Override
    public void validate(String input) {
        for(int i = 0; i < input.length() - 1; i++) {
            char current = input.charAt(i);
            char next = input.charAt(i + 1);
            if(CharacterValidator.isSeparator(current) && CharacterValidator.isSeparator(next)) {
                throw new IllegalArgumentException(CONSECUTIVE_SEPARATOR.getMessage());
            }
        }
    }
}
