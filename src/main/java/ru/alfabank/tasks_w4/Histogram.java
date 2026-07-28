package ru.alfabank.tasks_w4;

import ru.alfabank.Utils;

import java.util.Arrays;

public class Histogram {
    static void main() {
        System.out.println("Введите размер массива:");
        int n=Utils.ReadFromConsole.readPosInt();
        int[] array= Utils.ArrayUtils.generateIntArray(n,9);
        int sum=0;
        int[] counts=new int[10];
        Arrays.fill(counts,0);
        for (int x:array) {
            counts[x]+=1;
        }
        for(int x:counts){
            sum+=x;
        }
        System.out.println("Массив: "+Arrays.toString(array));
        System.out.println("Гистограмма кол-ва цифр: "+Arrays.toString(counts)
        +", сумма: "+sum);
    }
}
