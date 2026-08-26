package ru.alfabank.tasks_w3;

import java.util.Scanner;

public class EvenOdd {
    int number = 0;

    static void main() {
        EvenOdd eo = new EvenOdd();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer:");

        try {
            eo.number = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Error. Not integer.");
            return;
        }

//        if(scan.hasNextInt()){
//            eo.number=scan.nextInt();
//        }
//        else {
//            System.out.println("Error. Not integer.");
//            return;
//        }
        if (eo.number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
