package com.svs;

import java.util.*;

public class Sets {
    public static void main(String[] args) {

        HashSet<String> hset = new HashSet<>();

        // Creating a TreeSet of HashSet elements
        /*Set<String> treeSet = new TreeSet<>(hset);*/

        // Creating a List of HashSet elements
        /*List<String> list = new ArrayList<String>(hset);*/

        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Apple");
        hset.add("Orange");
        hset.add("Fig");

        //Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");
        //Addition of null values
        hset.add(null);
        hset.add(null);

        /*Iterator<String> itr = hset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/

        for (String str:hset) {
            System.out.println(str);
        }
    }
}
