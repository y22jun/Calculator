package validator;

import check.CharacterValidator;
import check.CustomCharacterValidator;

import static exception.ErrorMessage.*;

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

    private void SeparatorValidate(String input) {
        for(int i = 0; i < input.length() - 2; i++) {
            char current = input.charAt(i);
            if(!Character.isDigit(current) && !customCharacterValidator.isSeparator(current) && !customCharacterValidator.isWhiteSpace(current)) {
                throw new IllegalArgumentException(INVALID_SEPARATOR.getMessage());
            }
        }
    }

    private void EndOperatorValidate(String input) {
        char current = input.charAt(input.length() - 1);
        if(!customCharacterValidator.isOperator(current)) {
            throw new IllegalArgumentException(INVALID_OPERATE.getMessage());
        }
    }
}
