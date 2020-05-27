package com.svs;

public class Armstrong {
    public static void main(String[] args) {
        int number = 153;
        int original = number;
        int sum = 0;
        while(number != 0) {

            int r = number % 10;
            sum = sum+ r*r*r;
            number /= 10;
        }
        if(sum==original){
            System.out.println("Is Armstrong");
        } else {
            System.out.println("Is Not Armstrong");
        }
    }
}
