package by.andersen.trainee.kudko.collection.exception;

public class OutOfMemoryError extends VirtualMachineError {
    public OutOfMemoryError() {
    }

    public OutOfMemoryError(String message) {
        super(message);
    }

    public OutOfMemoryError(String message, Throwable cause) {
        super(message, cause);
    }

    public OutOfMemoryError(Throwable cause) {
        super(cause);
    }
}
