package ru.alfabank.tasks_w3;
import ru.alfabank.Utils;

import java.util.Scanner;

public class SumNumbers {
    static void main() {
        Scanner scan=new Scanner(System.in);
        int sum =0;
        while (true){
            System.out.println("Введите целое число:");
            int num= Utils.ReadFromConsole.readInt();
            sum +=num;
            if (num==0){
                System.out.println("Сумма введенных чисел: "+sum);
                break;
            }
        }
        scan.close();
    }
}
