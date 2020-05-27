package com.svs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("list1");
        arrayList.add("list2");
        arrayList.add("list3");
        arrayList.add("list4");
        arrayList.add("list5");
        arrayList.add(2, "newList");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        for (String str: arrayList) {
            System.out.println(str);
        }

        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}
