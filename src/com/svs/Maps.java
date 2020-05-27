package com.svs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maps {

    public static void main(String[] args) {

        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        /*Adding elements to HashMap*/
        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");
        hmap.put(34, "soma");
        hmap.put(79, "toma");

        Set keys = hmap.entrySet();
        Iterator iterator = keys.iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        for(Map.Entry entry:hmap.entrySet()){
            System.out.println("Key: "+entry.getKey() + " & Value: " + entry.getValue());
        }

        String str = hmap.get(79);
        System.out.println(str);

    }
}
