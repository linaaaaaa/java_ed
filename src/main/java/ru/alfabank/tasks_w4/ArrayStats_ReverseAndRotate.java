package ru.alfabank.tasks_w4;

import ru.alfabank.Utils;

import java.util.Arrays;

public class ArrayStats_ReverseAndRotate {
    static void main() {
        //ArraySort
        System.out.println("Введите размер массива: ");
        int arrayLength = Utils.ReadFromConsole.readPosInt();
        int[] array = Utils.ArrayUtils.generateIntArray(arrayLength, 100);
        int sum = 0;
        int min = 0;
        int max = 0;
        float average;
        for (int i = 0; i < arrayLength; i++) {
            sum += array[i];
            if (i == 0) {
                min = array[i];
                max = array[i];
            } else {
                if (array[i] < min) {
                    min = array[i];
                }
                if (array[i] > max) {
                    max = array[i];
                }
            }
            if (i + 1 != arrayLength) {
                System.out.print(array[i] + " ");
            } else {
                System.out.println(array[i]);
            }
        }
        average = (float) sum / arrayLength;
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Сумма: " + sum);
        System.out.printf("Среднее арифметическое: %.2f\n", average);

        //ReverseAndRotate
        ArrayStats_ReverseAndRotate arrayStats = new ArrayStats_ReverseAndRotate();
        System.out.println("Массив в развороте: " + Arrays.toString(arrayStats.reverse(array)));
        System.out.println("Введите целое положительное число:");
        int k = Utils.ReadFromConsole.readPosInt();
        System.out.println("Массив с ротацией на " + k + ": " + Arrays.toString(arrayStats.rotate(array, k)));

        //InsertAndRemove
        System.out.println("Insert 3 at 2nd place:");
        System.out.println(Arrays.toString(arrayStats.insert(array,2,3)));
        System.out.println("Remove 2nd:");
        System.out.println(Arrays.toString(arrayStats.remove(array,2)));
//        arrayStats.insert(array,100,1);
//        arrayStats.remove(array,100);
    }

    public int[] reverse(int[] intArray) {
        int[] arrayCopy = Arrays.copyOf(intArray, intArray.length);
        for (int i = 0; i < arrayCopy.length / 2; i++) {
            int n = arrayCopy[i];
            arrayCopy[i] = arrayCopy[arrayCopy.length - 1 - i];
            arrayCopy[arrayCopy.length - 1 - i] = n;
        }
        return arrayCopy;
    }

    public int[] rotate(int[] intArray, int k) {
        int[] arrayCopy = Arrays.copyOf(intArray, intArray.length);
        k = k % arrayCopy.length;
        if (k != 0) {
            for (int i = 0; i < intArray.length; i++) {
                int index = (i - k + arrayCopy.length) % arrayCopy.length;
                arrayCopy[i] = intArray[index];
            }
        }
        return arrayCopy;
    }

    public int[] insert(int[] array, int index, int value) {
        if(index>=array.length){
            System.out.println("Index out of bounds");
            System.exit(0);
        }
        int[] arrayCopy=new int[array.length+1];
        if(index!=0){
            System.arraycopy(array,0,arrayCopy,0,index);
        }
        if(index!=array.length-1){
            System.arraycopy(array,index,arrayCopy,index+1,array.length-index);
        }
        arrayCopy[index]=value;
        return arrayCopy;
    }

    public int[] remove(int[] array, int index) {
        if(index>=array.length){
            System.out.println("Index out of bounds");
            System.exit(0);
        }
        int[] arrayCopy=new int[array.length-1];
        if(index!=0)
            System.arraycopy(array,0,arrayCopy,0,index);
        if (index!=arrayCopy.length)
            System.arraycopy(array,index+1,arrayCopy,index,arrayCopy.length-index);
        return arrayCopy;
    }
}