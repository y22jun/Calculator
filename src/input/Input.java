package input;

import validator.Validator;

import java.util.Scanner;

public class Input {

    private final String input;

    public Input() {
        input = new Scanner(System.in).nextLine();
        Validator validator = new Validator();
        validator.AllValidate(input);
    }

    public String getInput() {
        return input;
    }
}
