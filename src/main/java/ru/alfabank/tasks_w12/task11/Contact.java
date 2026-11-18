package ru.alfabank.tasks_w12.task11;

public class Contact {
    private String email;

    public Contact(String email) {
        this.email = email;
    }

    public Contact() {
        this.email="N/A";
    }

    public String getEmail() {
        return email;
    }
}
