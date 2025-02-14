import input.InputHandler;
import parser.OperatorParser;
import parser.SeparatorParser;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        String input = inputHandler.getInput();
        SeparatorParser separatorParser = new SeparatorParser();
        List<Double> separatorResult = separatorParser.parserSeparator(input);
        OperatorParser operatorParser = new OperatorParser();
        char operatorResult = operatorParser.parserOperator(input);
        System.out.println(separatorResult);
        System.out.println(operatorResult);
    }
}