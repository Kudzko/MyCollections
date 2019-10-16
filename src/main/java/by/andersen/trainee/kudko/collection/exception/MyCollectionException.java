package by.andersen.trainee.kudko.collection.exception;

public class MyCollectionException extends Exception {
    public MyCollectionException() {
    }

    public MyCollectionException(String message) {
        super(message);
    }

    public MyCollectionException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyCollectionException(Throwable cause) {
        super(cause);
    }

    public MyCollectionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
