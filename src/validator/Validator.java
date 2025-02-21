package validator;

import check.CustomCharacterValidator;

import static exception.ErrorMessage.CONSECUTIVE_SEPARATOR;
import static exception.ErrorMessage.INPUT_EMPTY;

public class Validator {

    private final CustomCharacterValidator customCharacterValidator = new CustomCharacterValidator();

    private void NotEmptyValidate(String input) {
        if(input == null || input.isEmpty()) {
            throw new IllegalArgumentException(INPUT_EMPTY.getMessage());
        }
    }

    private void ConsecutiveSeparatorValidate(String input) {
        for(int i = 0; i < input.length() - 1; i++) {
            char current = input.charAt(i);
            char next = input.charAt(i + 1);
            if(customCharacterValidator.isSeparator(current) && customCharacterValidator.isSeparator(next)) {
                throw new IllegalArgumentException(CONSECUTIVE_SEPARATOR.getMessage());
            }
        }
    }
}
