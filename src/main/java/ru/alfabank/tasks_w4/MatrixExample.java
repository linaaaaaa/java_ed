package ru.alfabank.tasks_w4;

import ru.alfabank.tasks_w3.MultiplicationTable;

public class MatrixExample {
    static void main() {
        //Взяла из одной из прошлых задач матрицу 10х10, т.к. суть та же
        MultiplicationTable mt=new MultiplicationTable();
        mt.print();
        int[][] array=mt.getNumbers();
        int sumDiagonal=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i==j){
                    sumDiagonal+=array[i][j];
                }
            }
        }
        System.out.println("Сумма: "+sumDiagonal);
    }
}
