package parser;

import java.util.ArrayList;
import java.util.List;

public class SeparatorParser {

    public List<Double> parserSeparator(String input) {
        List<Double> result = new ArrayList<>();
        for(int i = 0; i < input.length() - 1; i++) {
            if(Character.isDigit(input.charAt(i))) {
                result.add(Double.parseDouble(String.valueOf(input.charAt(i))));
            }
        }
        return result;
    }
}
