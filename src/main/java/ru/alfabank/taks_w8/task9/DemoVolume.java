package ru.alfabank.taks_w8.task9;

public class DemoVolume {
    static void main() {
        System.out.println(new Box("B", 2, 3, 4).volume());
        System.out.printf("%.2f%n", new Sphere("S", 1).mass(2.7));
        //test illegalargument exception
        // System.out.println(new Box("B",-1,2,3).volume());
    }
}
