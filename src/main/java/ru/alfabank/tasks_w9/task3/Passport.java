package ru.alfabank.tasks_w9.task3;

public class Passport {
    private int age;

    public Passport(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Некорректный возраст.");
        }
        this.age = age;
        System.out.println("Passport of age "+age+" successfully created.");
    }
}
