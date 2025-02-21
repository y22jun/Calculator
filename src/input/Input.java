package input;

import validator.AllValidator;

import java.util.Scanner;

public class Input {

    private final String input;
    private final AllValidator allValidator = new AllValidator();

    public Input() {
        input = new Scanner(System.in).nextLine();
        allValidator.validateAll(input);
    }

    public String getInput() {
        return input;
    }
}
