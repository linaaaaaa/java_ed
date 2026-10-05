package ru.alfabank.taks_w8.task1;

public class Triangle extends GeometricFigure{
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public Triangle(String name, double height, double base) {
        super(name);
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return height*base/2;
    }
}
