package ru.alfabank.tasks_w9.task1;

public class ExceptionHandlingDemo {
    static void main() {
        try {
            //test catch Exception
            //double a=1/0;
            int num = Integer.parseInt("abc.txt");
            int[] numbers = new int[3];
            System.out.println(numbers[5]);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Program error: " + e.getMessage());
            //интересно, но вот так не работает (программа фейлится):
            // System.out.println("Error: "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
            System.out.println("Cased by: " + e.getCause());
            e.printStackTrace();
        }
    }
}
