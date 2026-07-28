package ru.alfabank.tasks_w4;

import ru.alfabank.Utils;

import java.util.Arrays;

public class ArraySort_ReverseAndRotate {
    static void main() {
        System.out.println("Введите размер массива: ");
        int arrayLength= Utils.ReadFromConsole.readPosInt();
        int[] array=new int[arrayLength];
        System.out.println("Введите "+arrayLength+" целых чисел: ");
        for (int i = 0; i < arrayLength; i++) {
            array[i]=Utils.ReadFromConsole.readInt();
        }
        int[] arrayCopy=Arrays.copyOf(array,arrayLength);
        for (int i = 0; i < arrayLength-1; i++) {
            for (int j = i+1; j < arrayLength; j++) {
                if (array[j]<array[i]){
                    int n=array[i];
                    array[i]=array[j];
                    array[j]=n;
                }
            }
        }
        System.out.println("Массив отсортированный:"+Arrays.toString(array));

        Arrays.sort(arrayCopy);
        System.out.println("Массив для проверки:"+Arrays.toString(arrayCopy));
    }


}
