package ru.alfabank.task3;
import java.util.Scanner;

public class SumNumbers {
    static void main() {
        Scanner scan=new Scanner(System.in);
        int sum =0;
        while (true){
            System.out.println("Введите целое число:");
            int num;
            if(scan.hasNextInt()){
                num =scan.nextInt();
            }
            else {
                System.out.println("Ошибка. Некорректный ввод");
                scan.close();
                return;
            }
            sum +=num;
            if (num==0){
                System.out.println("Сумма введенных чисел: "+sum);
                break;
            }
        }
        scan.close();
    }
}
