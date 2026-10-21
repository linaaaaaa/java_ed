package ru.alfabank.tasks_w10.task1;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    static void main() {
        List<String> myList = new ArrayList<>();
        myList.add("красный");
        myList.add("синий");
        myList.add("зеленый");
        myList.add("синий");
        System.out.println(myList.size() + " цвета(ов): " + myList);
        myList.remove("синий");
        System.out.println(myList);
        myList.remove(1);
        System.out.println(myList);
        System.out.println(myList.get(0));
        myList.set(0, "желтый");
        System.out.println(myList);
        for (String s : myList) {
            System.out.println("foreach " + s);
        }
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("fori " + myList.get(i));
        }
        myList.clear();
        System.out.println(myList.size());
    }
}
