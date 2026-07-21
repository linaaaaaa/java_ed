package ru.alfabank.task3;

public class MultiplicationTable {
    private int numbers[][]=new int[10][10];

    static void main() {
        MultiplicationTable mt=new MultiplicationTable();
        for (int i = 0; i < mt.numbers.length; i++) {
            for (int j = 0; j < mt.numbers[i].length; j++) {
                mt.numbers[i][j]=(i+1)*(j+1);
                System.out.print(mt.numbers[i][j]);
                if(j+1==mt.numbers.length){
                    System.out.println();
                }
                else {
                    System.out.print(" | ");
                }
            }
        }
    }
}
