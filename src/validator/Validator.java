package validator;

import static exception.ErrorMessage.INPUT_EMPTY;

public class Validator {

    private void NotEmptyValidate(String input) {
        if(input == null || input.isEmpty()) {
            throw new IllegalArgumentException(INPUT_EMPTY.getMessage());
        }
    }
}
