package ru.alfabank.tasks_w5;

public class PrintArrayRecursively {
    public void printArrayRecursively(int[] arr, int index){
        if(index>=arr.length){
            return;
        }
        else{
            System.out.print(arr[index]+" ");
            printArrayRecursively(arr,index+1);
        }
    }

    static void main() {
        int[] arr={1,2,3,4,5,6,7};
        new PrintArrayRecursively().printArrayRecursively(arr,3);
        new PrintArrayRecursively().printArrayRecursively(arr,7);
    }
}
