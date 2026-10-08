package ru.alfabank.tasks_w8.task9;

public abstract class Solid implements HasVolume {
    private String name;

    public Solid(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
