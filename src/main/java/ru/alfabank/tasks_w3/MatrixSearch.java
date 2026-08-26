package ru.alfabank.tasks_w3;
import ru.alfabank.Utils;

import java.util.Scanner;
import java.util.Random;

public class MatrixSearch {
    private int[][] matrix;
    private int target;

    static void main() {
        int length;
        int width;
        MatrixSearch matrixSearch=new MatrixSearch();
        System.out.print("Введите длину массива: ");
        length= Utils.ReadFromConsole.readPosInt();
        System.out.print("Введите ширину массива: ");
        width=Utils.ReadFromConsole.readPosInt();
        System.out.println("Матрица сгенерирована:");
        matrixSearch.matrix=new int[length][width];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                matrixSearch.matrix[i][j]=new Random().nextInt(100);
                System.out.print(matrixSearch.matrix[i][j]);
                if(j+1==width){
                    System.out.println();
                }
                else {
                    System.out.print(" | ");
                }
            }
        }

        System.out.print("Введите искомое число: ");
        matrixSearch.target=Utils.ReadFromConsole.readInt();
        boolean targetFound=false;
        searchTarget: for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if (matrixSearch.matrix[i][j]==matrixSearch.target){
                    System.out.println("Найдено: row="+(i+1)+", column="+(j+1));
                    targetFound=true;
                    break searchTarget;
                }
            }
        }
        if(!targetFound){
            System.out.println("Число не найдено");
        }
    }

//    private int readPosInt(){
//        int resultPosInt;
//        resultPosInt=this.readInt();
//        if (resultPosInt<=0){
//                System.out.println("Ошибка. Необходимо ввести целое положительное число.");
//                System.exit(0);
//            }
//        else{
//            return resultPosInt;
//        }
//        return resultPosInt;
//    }
//
//    private int readInt(){
//        Scanner scanner=new Scanner(System.in);
//        int resultInt=0;
//        if(scanner.hasNextInt()){
//            resultInt=scanner.nextInt();
//            scanner.close();
//            return resultInt;
//        }
//        else {
//            System.out.println("Ошибка. Необходимо ввести целое положительное число.");
//            System.exit(0);
//        }
//        return resultInt;
//    }
}
