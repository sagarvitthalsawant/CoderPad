package com.svs;

import java.util.*;

public class CharacterNoOccurencesInString {

    public static void main(String[] args) {
        String str = "Write anything in this string";
        System.out.println(firstNonRepeatingChar(str));
    }

    public static char firstNonRepeatingChar(String word) {
        Set<Character> repeating = new HashSet<>();
        List<Character> nonRepeating = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (repeating.contains(letter)) {
                continue;
            }
            if (nonRepeating.contains(letter)) {
                nonRepeating.remove((Character) letter);
                repeating.add(letter);
            }
            else {
                nonRepeating.add(letter);
            }
        }
        return nonRepeating.get(0);
    }
}
