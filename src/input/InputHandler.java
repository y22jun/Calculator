package input;

import validator.AllValidator;

import java.util.Scanner;

public class InputHandler {

    private final String input;
    private final AllValidator allValidator;

    public InputHandler() {
        this.input = new Scanner(System.in).nextLine();
        this.allValidator = new AllValidator();
        this.allValidator.validateAll(this.input);
    }

    public String getInput() {
        return this.input;
    }
}
