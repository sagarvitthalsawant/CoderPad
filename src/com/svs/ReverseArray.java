package com.svs;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
//        int[] array = new int[] {101,102,103,104,105};
        String[] array = new String[] {"one", "two", "three", "four", "five"};
        for(int i=0; i<array.length/2; i++) {
            String temp = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = temp;
        }
        System.out.println(Arrays.toString(array));

    }


}
