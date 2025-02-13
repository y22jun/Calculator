package exception;

public enum ErrorMessage {
    INPUT_EMPTY("입력값이 비어있습니다."),
    ;

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
