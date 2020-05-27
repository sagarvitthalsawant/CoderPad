package com.svs;

public class Factorial {

    public static void main(String[] args) {
        int number = 5;
        int output = 1;
        for(int i=1; i<=number; i++){
            output = output*i;
        }
        System.out.println(output);
    }
}
