package ru.alfabank.tasks_w8.task2;

public class Point implements Movable {
    private int x;
    private int y;

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("x: " + this.x + ", y: " + this.y);
    }

    @Override
    public void stop() {
        System.out.println("Point's stopped");
    }
}
