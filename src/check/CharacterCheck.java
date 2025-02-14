package check;

public class CharacterCheck {
    public static boolean isSeparator(char current) {
        return current == ':' || current == ',';
    }

    public static boolean isWhiteSpace(char current) {
        return current == ' ';
    }

    public static boolean isOperator(char current) {
        return current == '+' || current == '-' || current == '*' || current == '/';
    }
}
