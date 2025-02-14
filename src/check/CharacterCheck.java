package check;

public class CharacterCheck {
    public static boolean isSeparator(char c) {
        return c == ':' || c == ',';
    }

    public static boolean isWhiteSpace(char c) {
        return c == ' ';
    }

    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
}
