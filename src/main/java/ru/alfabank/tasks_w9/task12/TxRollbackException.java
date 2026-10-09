package ru.alfabank.tasks_w9.task12;

public class TxRollbackException extends RuntimeException {
    public TxRollbackException(String message) {
        super(message);
    }
}
