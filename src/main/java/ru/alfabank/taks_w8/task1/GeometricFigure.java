package ru.alfabank.taks_w8.task1;

public abstract class GeometricFigure {
    protected String name;

    public GeometricFigure(String name) {
        this.name = name;
    }

    public GeometricFigure(){}

    public abstract double calculateArea();

    public String getName(){
        return name;
    }


}
