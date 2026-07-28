package ru.alfabank.tasks_w4;

import ru.alfabank.Utils;

import java.util.Arrays;
import java.util.Random;

public class ArrayStats {
    static void main() {
        //ArraySort
        System.out.println("Введите размер массива: ");
        int arrayLength=Utils.ReadFromConsole.readPosInt();
        int [] array=Utils.ArrayUtils.generateIntArray(arrayLength,100);
        int sum=0;
        int min=0;
        int max=0;
        float average;
        for (int i = 0; i < arrayLength; i++) {
            sum+=array[i];
            if(i==0){
                min=array[i];
                max=array[i];
            }else {
                if(array[i]<min){
                    min=array[i];
                }
                if(array[i]>max){
                    max=array[i];
                }
            }
            if(i+1!=arrayLength){
                System.out.print(array[i]+" ");
            }
            else {
                System.out.println(array[i]);
            }
        }
        average=(float)sum/arrayLength;
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
        System.out.println("Сумма: "+sum);
        System.out.printf("Среднее арифметическое: %.2f\n",average);

        //ReverseAndRotate
        ArrayStats arrayStats=new ArrayStats();
        System.out.println("Массив в развороте: "+ Arrays.toString(arrayStats.reverse(array)));
        System.out.println("Введите целое положительное число:");
        int k=Utils.ReadFromConsole.readPosInt();
        System.out.println("Массив с ротацией на "+k+": "+Arrays.toString(arrayStats.rotate(array,k)));
    }

    public int[] reverse(int[] intArray){
        int[] arrayCopy=Arrays.copyOf(intArray,intArray.length);
        for (int i = 0; i < arrayCopy.length/2; i++) {
            int n=arrayCopy[i];
            arrayCopy[i]=arrayCopy[arrayCopy.length-1-i];
            arrayCopy[arrayCopy.length-1-i]=n;
        }
        return arrayCopy;
    }

    public int[] rotate(int[] intArray, int k){
        int[] arrayCopy=Arrays.copyOf(intArray,intArray.length);
        k=k%arrayCopy.length;
        if(k!=0) {
            for (int i = 0; i<intArray.length; i++) {
                int index = (i - k + arrayCopy.length) % arrayCopy.length;
                arrayCopy[i]=intArray[index];
            }
        }
        return arrayCopy;
    }
}
