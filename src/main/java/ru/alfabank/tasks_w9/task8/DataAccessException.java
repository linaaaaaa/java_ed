package ru.alfabank.tasks_w9.task8;

public class DataAccessException extends RuntimeException {
    public DataAccessException(String message) {
        super(message);
    }

    public DataAccessException(String message, Throwable cause) {
        super("Ошибка чтения файла: " + message, cause);
    }
}
