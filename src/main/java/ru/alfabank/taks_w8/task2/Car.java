package ru.alfabank.taks_w8.task2;

public class Car implements Movable {
    private String address;

    public Car() {
        this(0, 0);
    }

    public Car(int x, int y) {
        setAddress(x, y);
    }

    @Override
    public void move(int x, int y) {
        String currentAddress = address;
        setAddress(x, y);
        System.out.println("Car moved from " + currentAddress + " to " + address);
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(int x, int y) {
        address = "x:" + x + ", y:" + y;
    }
}
