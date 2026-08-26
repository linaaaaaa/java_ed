package ru.alfabank.tasks_w5;

public class RecursionDemo {
    long factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    long factorialIter(int n){
        int factorialResult=1;
        if (n==0){
            return factorialResult;
        }
        for (int i = n; i > 0; i--){
            factorialResult=factorialResult*i;
        }
        return factorialResult;
    }

    static void main() {
        int[] numbers={0,1,5,10};
//        for(int x:numbers){
//            System.out.println(x+"!="+new RecursionDemo().factorial(x));
//        }
        for(int x:numbers){
            System.out.println(x+"!="+new RecursionDemo().factorialIter(x));
        }
    }
}
