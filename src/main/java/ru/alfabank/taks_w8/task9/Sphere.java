package ru.alfabank.taks_w8.task9;

public class Sphere extends Solid{
    private double r;

    public Sphere(String name, double r) {
        super(name);
        this.r = r;
    }

    public Sphere(double r){
        this("Sphere",r);
    }

    @Override
    public double volume() {
        return 4*Math.PI*Math.pow(r,3)/3;
    }
}
