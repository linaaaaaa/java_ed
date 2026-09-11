package ru.alfabank.tasks_w7.Animals;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    public Cat(String name){
        super(name);
    }
    public void scratch(){
        System.out.println(name+" scratches");
    }
}
