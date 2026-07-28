package ru.alfabank;


import java.util.Random;
import java.util.Scanner;

public class Utils {
    public static class ReadFromConsole {
        public static int readInt() {
            Scanner scanner = new Scanner(System.in);
            int resultInt = 0;
            if (scanner.hasNextInt()) {
                resultInt = scanner.nextInt();
//                scanner.close();
                return resultInt;
            } else {
                System.out.println("Ошибка. Необходимо ввести целое число.");
                System.exit(0);
            }
            return resultInt;
        }

        public static int readPosInt() {
            int resultPosInt;
            resultPosInt = Utils.ReadFromConsole.readInt();
            if (resultPosInt < 0) {
                System.out.println("Ошибка. Необходимо ввести целое положительное число.");
                System.exit(0);
            } else {
                return resultPosInt;
            }
            return resultPosInt;
        }
    }

    public static class ArrayUtils{
        public static int[] generateIntArray(int n, int randomUpperNumber) {
            int[] intArray = new int[n];
            for (int i = 0; i < n; i++) {
                intArray[i] = new Random().nextInt(randomUpperNumber);
            }
            return intArray;
        }
    }
}