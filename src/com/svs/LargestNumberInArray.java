package com.svs;

public class LargestNumberInArray {

    public static void main(String[] args) {
        int max = 0;
        int [] array = new int [] {21, 32, 43, 54, 65, 76, 87, 98};
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= array[max]){
                max=i;
            }
        }
        System.out.println(array[max]);
    }
}
