package validator;

import java.util.ArrayList;
import java.util.List;

public class AllValidator implements Validator {

    private final List<Validator> validators;

    public AllValidator() {
        this.validators = List.of(
                new EmptyValidator(),
                new ConsecutiveSeparatorValidator(),
                new SeparatorValidator(),
                new EndOperatorValidator(),
                new WhitespaceBeforeOperatorValidator()
        );
    }

    @Override
    public void validate(String input) {
        for (Validator validator : validators) {
            validator.validate(input);
        }
    }
    public void validateAll(String input) {
        validate(input);
    }
}
