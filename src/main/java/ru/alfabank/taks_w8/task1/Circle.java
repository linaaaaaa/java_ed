package ru.alfabank.taks_w8.task1;

public class Circle extends GeometricFigure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}
