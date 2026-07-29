package ru.alfabank.tasks_w2;
import ru.alfabank.Utils;

import java.util.Scanner;

public class Rectangle {
    int length=0;
    int width=0;

    static void main() {
        Rectangle rec=new Rectangle();
        System.out.println("Введите длину:");
        rec.length= Utils.ReadFromConsole.readPosInt();
        System.out.println("Введите ширину:");
        rec.width=Utils.ReadFromConsole.readPosInt();
        int perimeter =(rec.length+ rec.width)*2;
        int area= rec.length* rec.width;
        System.out.println("Периметр прямоугольник: "+ perimeter);
        System.out.println("Площадь прямоугольника: "+area);
    }
//
//    private int readPosInt(){
//        Scanner scanner=new Scanner(System.in);
//        int resultInt=0;
//        if(scanner.hasNextInt()){
//            resultInt=scanner.nextInt();
//            if (resultInt<=0){
//                System.out.println("Ошибка. Необходимо ввести целое положительное число.");
//                System.exit(0);
//            }
//        }
//        else {
//            System.out.println("Ошибка. Необходимо ввести целое положительное число.");
//            System.exit(0);
//        }
//        return resultInt;
//    }
}
