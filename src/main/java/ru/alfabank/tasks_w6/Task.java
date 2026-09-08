package ru.alfabank.tasks_w6;

public class Task {
    private static int id;
    private String title;
    private Status status;

    public Task start() {
        if (status != Status.NEW) {
            throw new IllegalStateException("wrong transition from " + status);
        } else {
            status = Status.IN_PROGRESS;
        }
        return this;
    }

    public Task complete() {
        if (status != Status.IN_PROGRESS) {
            throw new IllegalStateException("wrong transition from " + status);
        } else {
            status = Status.DONE;
        }
        return this;
    }

    public static int getCount() {
        return id;
    }

    public Task(String title) {
        this();
        this.title = title;
    }

    public Task() {
        id += 1;
        status = Status.NEW;
        title = "task_" + id;
    }

    public Status getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }
}
