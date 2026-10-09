package ru.alfabank.tasks_w9.task3;

public class PassportTest {
    static void main() {
        try {
            Passport passport1 = new Passport(14);
            Passport passport2 = new Passport(-2);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
