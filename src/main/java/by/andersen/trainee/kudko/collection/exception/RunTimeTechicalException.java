package by.andersen.trainee.kudko.collection.exception;

public class RunTimeTechicalException extends RuntimeException {
    public RunTimeTechicalException() {
    }

    public RunTimeTechicalException(String message) {
        super(message);
    }

    public RunTimeTechicalException(String message, Throwable cause) {
        super(message, cause);
    }

    public RunTimeTechicalException(Throwable cause) {
        super(cause);
    }

    public RunTimeTechicalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
