package by.andersen.trainee.kudko.collection.exception;

public class IllegalSizeExcetion extends RunTimeTechicalException {
    public IllegalSizeExcetion() {
    }

    public IllegalSizeExcetion(String message) {
        super(message);
    }

    public IllegalSizeExcetion(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalSizeExcetion(Throwable cause) {
        super(cause);
    }

    public IllegalSizeExcetion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
