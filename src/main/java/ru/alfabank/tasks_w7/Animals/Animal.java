package ru.alfabank.tasks_w7.Animals;

public class Animal {
    protected String name;

    public Animal(String name){
        this.name=name;
    }

    public void makeSound(){
        System.out.println("*sounds of breathing*");
    }
}

