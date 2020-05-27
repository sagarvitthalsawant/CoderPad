package com.svs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        List<String> sortString = new ArrayList();
        sortString.add("Bubble sort");
        sortString.add("Character_Occurences_In_String");
        sortString.add("Character_No_Occurences_In_String");
        sortString.add("StringToInt");
        sortString.add("RemovingDuplicatesFromArray");
        sortString.add("ReverseArray");
        sortString.add("SwapIntegersWithoutTemp");
        sortString.add("Fibonacci");
        sortString.add("PrimeNumber");
        sortString.add("Palindrome");

        sortString.add("Armstrong");
        sortString.add("LeapYear");
        sortString.add("AvoidDeadlock");
        sortString.add("Favtorial");
        sortString.add("VowelCountInString");
        sortString.add("LargestNumberInArray");
        sortString.add("SearchWord");

        sortString.add("ArrayLists");
        sortString.add("Sets");
        sortString.add("Maps");

        Collections.sort(sortString);

        for (String str:sortString) {
            System.out.println(str);
        }
    }
}
