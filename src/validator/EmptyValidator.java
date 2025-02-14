package validator;

import static exception.ErrorMessage.INPUT_EMPTY;

public class EmptyValidator implements Validator {

    @Override
    public void validate(String input) {
        if(input == null || input.isEmpty()) {
            throw new IllegalArgumentException(INPUT_EMPTY.getMessage());
        }
    }
}
