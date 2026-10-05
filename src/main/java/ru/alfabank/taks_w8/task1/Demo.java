package ru.alfabank.taks_w8.task1;

public class Demo {
    static void main() {
        GeometricFigure[] figs={new Circle("Круг",5),new Triangle("Треугольник",3,4)};
        for (GeometricFigure g:figs) {
            System.out.println(g.getName() + ", S: " + String.format("%.2f",g.calculateArea()));
        }
    }
}
