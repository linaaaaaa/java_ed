package ru.alfabank.tasks_w7.Animals;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    public void scratch(){
        System.out.println(name+" scratches");
    }
}
