package ru.alfabank.tasks_w7.Shapes;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
       this.radius=radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
