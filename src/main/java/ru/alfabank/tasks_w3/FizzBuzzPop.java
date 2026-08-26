package ru.alfabank.tasks_w3;

import java.util.Scanner;

public class FizzBuzzPop {
    private String fizzBuzzPop="";

    public FizzBuzzPop(){}

    public FizzBuzzPop(int number){
        this.checkFizz(number);
        this.checkBuzz(number);
        this.checkPop(number);
    }

    static void main() {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите число: ");
        if(scanner.hasNextInt()){
            n=scanner.nextInt();
            if (n <=0){
                System.out.println("Ошибка. Необходимо ввести целое положительное число.");
                return;
            }
        }
        else {
            System.out.println("Ошибка. Необходимо ввести целое положительное число.");
            return;
        }
        scanner.close();

        for (int i = 0; i < n; i++) {
            FizzBuzzPop fbp=new FizzBuzzPop(i+1);
            if(fbp.fizzBuzzPop.isEmpty()){
                continue;
            }
            else {
                System.out.println(fbp.fizzBuzzPop);
            }
        }
    }

    private void checkFizz(int number){
        if(number%3==0){
            this.fizzBuzzPop=this.fizzBuzzPop+"Fizz";
        }
        return;
    }

    private void checkBuzz(int number){
        if(number%5==0){
            this.fizzBuzzPop=this.fizzBuzzPop+"Buzz";
        }
        return;
    }

    private void checkPop(int number){
        if(number%7==0){
            this.fizzBuzzPop=this.fizzBuzzPop+"Pop";
        }
        return;
    }
}
