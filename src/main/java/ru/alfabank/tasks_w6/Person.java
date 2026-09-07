package ru.alfabank.tasks_w6;

public class Person {
    private String name;
    private int age=0;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return this.name+", age:"+this.age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        if(age<0){
            throw new IllegalArgumentException("age must be >= 0");
        }
        this(name);
        this.age = age;
    }

    public Person() {
        this("Unknown");
    }
}
