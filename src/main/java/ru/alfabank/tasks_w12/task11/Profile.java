package ru.alfabank.tasks_w12.task11;

public class Profile {
    private Contact contact;

    public Profile(Contact contact) {
        this.contact = contact;
    }

    public Profile() {
        this(new Contact());
    }

    public Contact getContact() {
        return contact;
    }
}
