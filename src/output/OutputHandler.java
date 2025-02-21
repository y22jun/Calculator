package output;

import calculator.Calculator;
import calculator.CalculatorResult;
import input.Input;

public class OutputHandler {

    private final Input inputHandler = new Input();
    private final Calculator calculator = new Calculator();

    public void startCalculator() {
        String input = inputHandler.getInput();
        CalculatorResult calculatorResult = calculator.calculate(input);
        printResult(calculatorResult);
    }

    private void printResult(CalculatorResult calculatorResult) {
        StringBuilder finalPrint = new StringBuilder();
        finalPrint.append(calculatorResult.numbers().get(0));

        for(int i = 1; i < calculatorResult.numbers().size(); i++) {
            finalPrint.append(" ").append(calculatorResult.operator()).append(" ").append(calculatorResult.numbers().get(i));
        }

        System.out.println(finalPrint + " = " + String.format("%.1f", calculatorResult.result()));
    }
}
