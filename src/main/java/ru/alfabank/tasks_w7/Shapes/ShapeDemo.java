package ru.alfabank.tasks_w7.Shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeDemo {
    static void main() {
        List<Shape> shapes=new ArrayList<>();
        shapes.add(new Rectangle(2,3.5));
        shapes.add(new Circle(5));
        for(Shape s:shapes){
            new ShapeDemo().printArea(s);
        }
    }

    public void printArea(Shape shape){
        System.out.println("Area: "+String.format("%.2f",shape.getArea()));
    }
}
