package ru.alfabank.tasks_w4;

import ru.alfabank.Utils;

import java.util.Arrays;

public class Triangle2DMatrix {
    static void main() {
        int n;
        System.out.println("Введите размер матрицы:");
        n= Utils.ReadFromConsole.readPosInt();
        int[][] matrix=new int[n][];
        int[] sum =new int[n];
        Arrays.fill(sum,0);
        for (int i = 0; i < n; i++) {
            matrix[i]=new int[i+1];
            for (int j = 0; j < i+1; j++) {
                matrix[i][j]=i+j;
                sum[i]+=matrix[i][j];
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        System.out.println("Суммы строк: "+Arrays.toString(sum));
    }
}
