package com.svs;

public class SwapIntegersWithoutTemp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("One way to swap two numbers without temp variable");
        System.out.printf("Before swap 'a': %d, 'b': %d %n", a, b);
        a = a + b;
        b = a - b;
        a = a - b;

//        a = (a + b) - (b = a);

        System.out.printf("After swapping, 'a': %d, 'b': %d %n", a, b);

    }
}
