package com.svs;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        bubbleSort(new int[] {20, 12, 45, 55, 65, 75, 34});
        /*bubbleSort(new int[] { -1, 0, 1 });
        bubbleSort(new int[] { -3, -9, -2, -1 });*/
    }

    private static void bubbleSort(int[] ints) {
        System.out.printf("Unsorted array in Java :%s %n", Arrays.toString(ints));
        for (int i=0; i<ints.length; i++) { /*1, 2, 3, 4*/
            for (int j = ints.length -1; j > i; j--) {  /*[4,3,2,1][4,3,2][4,3][4]*/
                if(ints[j]<ints[j - 1]){
                    swap(ints, j, j-1);
                }
            }
        }
        System.out.printf("Sorted Array using Bubble sort algorithm :%s %n", Arrays.toString(ints));
    }

    public static void swap(int[] array, int from, int to) {
        int temp = array[from];
        array[from] = array[to];
        array[to] = temp;
    }
}
