package com.svs;

public class Fibonacci {

    public static void main(String[] args) {
        int number = 21;
        for(int i=1;i<=number;i++){
            System.out.println(fibno(i));
        }
    }

    private static int fibno(int number) {
        if(number == 1 || number == 2){ return 1; }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        } return fibonacci; //Fibonacci number

    }
}
