package input;

import validator.Validator;

import java.util.Scanner;

public class InputHandler {

    private final String input;
    private final Validator validator;

    public InputHandler() {
        this.input = new Scanner(System.in).nextLine();
        this.validator = new Validator();
        this.validator.validateNotEmpty(this.input);
    }

    public String getInput() {
        return this.input;
    }
}
