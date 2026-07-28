package ru.alfabank.tasks_w3;

public class MultiplicationTable {
    private int numbers[][]=new int[10][10];

    static void main() {
        MultiplicationTable mt=new MultiplicationTable();
        mt.print();
    }

    public void print(){
        for (int i = 0; i < this.numbers.length; i++) {
            for (int j = 0; j < this.numbers[i].length; j++) {
                this.numbers[i][j]=(i+1)*(j+1);
                System.out.print(this.numbers[i][j]);
                if(j+1==this.numbers.length){
                    System.out.println();
                }
                else {
                    System.out.print(" | ");
                }
            }
        }
    }

    public int[][] getNumbers(){
        return this.numbers;
    }
}
