package ru.alfabank.tasks_w7.Animals;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    public Dog(String name) {
        super(name);
    }

    public void fetch(){
        System.out.println(name+" fetches");
    }
}
