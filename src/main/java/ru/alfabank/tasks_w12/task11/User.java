package ru.alfabank.tasks_w12.task11;

public class User {
    private Profile profile;

    public User(Profile profile) {
        this.profile = profile;
    }

    public User() {
        this(new Profile());
    }

    public Profile getProfile() {
        return profile;
    }
}
