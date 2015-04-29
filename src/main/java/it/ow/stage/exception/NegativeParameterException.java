package it.ow.stage.exception;

/**
 * Created by francesco on 29/04/15.
 */
public class NegativeParameterException extends Exception {
    public NegativeParameterException() {
    }

    public NegativeParameterException(String message) {
        super(message);
    }

    public NegativeParameterException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeParameterException(Throwable cause) {
        super(cause);
    }
}
