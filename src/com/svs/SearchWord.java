package com.svs;

public class SearchWord {

    public static void main(String[] args) {
        String strOrig = "jljkl klj lkl lkjl kjljk lkjdaskjaelfjid reoiuweo ilvkklfjlksjd lliejr lkwejflejkflkajsdl Hello readers";
        int intIndex = strOrig.indexOf("Hello");
        if(intIndex == - 1) {
            System.out.println("Hello not found");
        } else {
            System.out.println("Found Hello at index "+ intIndex);
        }
    }
}
