package ru.alfabank.task2;

public class StringExperiments {
    private String name="Лина";
    private int age=29;

    static void main() {
        StringExperiments se=new StringExperiments();
        System.out.println("Меня зовут "+se.name+", мне "+se.age+" лет.");
        System.out.println("Через 5 лет мне будет "+(se.age+5));
    }
}
