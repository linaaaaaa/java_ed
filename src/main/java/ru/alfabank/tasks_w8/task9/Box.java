package ru.alfabank.tasks_w8.task9;

public class Box extends Solid{
    private double w;
    private double h;
    private double d;

    public Box(double w, double h, double d) {
        this("Box",w,h,d);
    }

    public Box(String name, double w, double h, double d) {
        super(name);
        if(w<=0||h<=0||d<=0){
            throw new IllegalArgumentException("Box sides should be positive numbers");
        }
        this.w = w;
        this.h = h;
        this.d = d;
    }


    @Override
    public double volume() {
        return w*h*d;
    }
}
