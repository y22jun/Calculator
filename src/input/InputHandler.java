package input;

import java.util.Scanner;

public class InputHandler {

    private final String input;

    public InputHandler() {
        input = new Scanner(System.in).nextLine();
    }

    public String getInput() {
        return input;
    }
}
