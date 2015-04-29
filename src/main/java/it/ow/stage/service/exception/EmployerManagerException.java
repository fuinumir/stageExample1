package it.ow.stage.service.exception;

/**
 * Created by francesco on 29/04/15.
 */
public class EmployerManagerException extends Exception {
    public EmployerManagerException() {
    }

    public EmployerManagerException(String message) {
        super(message);
    }

    public EmployerManagerException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployerManagerException(Throwable cause) {
        super(cause);
    }
}
