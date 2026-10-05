package ru.alfabank.tasks_w7.Animals;

import java.util.ArrayList;
import java.util.List;

public class Household {
    static void main() {
        Animal[] animals={new Dog("Бобик"),new Cat("Мурка")};
        for (Animal a:animals){
            a.makeSound();
            if(a instanceof Dog){
                ((Dog)a).fetch();
            }
        }
    }
}
