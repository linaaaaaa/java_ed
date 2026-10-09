package ru.alfabank.tasks_w9.task3;

public class InvalidAgeException extends Exception{
    public InvalidAgeException() {
        super("InvalidAgeException");
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}
