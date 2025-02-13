import input.InputHandler;
import validator.Validator;

public class Main {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        String input = inputHandler.getInput();
        System.out.println(input);
    }
}