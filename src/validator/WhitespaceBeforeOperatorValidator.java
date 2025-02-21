package validator;

import check.CharacterValidator;

import static exception.ErrorMessage.MISSING_WHITESPACE_BEFORE_OPERATOR;

public class WhitespaceBeforeOperatorValidator implements Validator {

    @Override
    public void validate(String input) {
        char current = input.charAt(input.length() - 2);
        if(!CharacterValidator.isWhiteSpace(current)) {
            throw new IllegalArgumentException(MISSING_WHITESPACE_BEFORE_OPERATOR.getMessage());
        }
    }
}
