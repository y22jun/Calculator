package parser;

import check.CharacterValidator;

import java.util.ArrayList;
import java.util.List;

public class SeparatorParser {

    public List<Double> parserSeparator(String input) {
        List<Double> result = new ArrayList<>();
        StringBuilder number = new StringBuilder();

        for(int i = 0; i < input.length() - 2; i++) {
            appendNumber(input.charAt(i), number, result);
        }

        addNumberToList(number, result);
        return result;
    }

    private void appendNumber(char current, StringBuilder number, List<Double> result) {
        if(!CharacterValidator.isSeparator(current)) {
            number.append(current);
            return;
        }
        addNumberToList(number, result);
    }

    private void addNumberToList(StringBuilder number, List<Double> result) {
        if(number.isEmpty()) {
            return;
        }

        result.add(Double.parseDouble(number.toString().trim()));
        number.setLength(0);
    }
}
