package ru.alfabank.taks_w8.task2;

import java.util.ArrayList;
import java.util.List;

public class DemoMovable {

    static void main() {
        List<Movable> movables=new ArrayList<>();
        movables.add(new Car());
        movables.add(new Point());
        for (Movable m:movables){
            m.move(10,20);
            m.stop();
        }
    }
}
