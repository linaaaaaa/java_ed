package ru.alfabank.tasks_w6;

import java.util.Arrays;

public class GradeBook {
    private int[] grades;

    public void setGrade(int index, int value) {
        if(index<0||index>=grades.length){
            System.out.println("Индекс за пределами размера массива");
            return;
        }
        grades[index] = value;
    }

    public int min() {
        return Arrays.stream(grades).min().getAsInt();
    }

    public int max() {
        return Arrays.stream(grades).max().getAsInt();
    }

    public double average(){
        return Arrays.stream(grades).average().getAsDouble();
    }

    public GradeBook(int[] grades) {
        this.grades = Arrays.copyOf(grades, grades.length);
    }

    public int[] getGrades() {
        return Arrays.copyOf(grades, grades.length);
    }

    static void main() {
        int[] src={5,4,3};
        GradeBook book=new GradeBook(src);
        src[0]=1;
        System.out.println("books array: "+Arrays.toString(book.getGrades()));

        book.setGrade(1,10);
        System.out.println("books array: "+Arrays.toString(book.getGrades()));

        System.out.println(book.average());
    }
}
