package com.svs;

public class PrimeNumber {

    public static void main(String[] args) {
        int numberCheck = 24;
        System.out.println("Number is prime : "+isPrime(numberCheck));
    }

    private static boolean isPrime(int numberCheck) {
        int sqrt = (int) Math.sqrt(numberCheck) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (numberCheck % i == 0) {
             return false; }
        } return true;
    }
}
