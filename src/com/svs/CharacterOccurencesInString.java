package com.svs;

public class CharacterOccurencesInString {

    public static void main(String[] args) {
        String input = "Today is Monday";

        //counting occurrence of character with loop
        int charCount = 0;
        for(int i =0 ; i<input.length(); i++){
            if(input.charAt(i) == 'a'){
                charCount++;
            }
        }

        System.out.println("count of character 'a' on String: 'Today is Monday' using for each loop  " + charCount);

        int charCountNew = 0; //resetting character count
        for(char ch: input.toCharArray()){
            if(ch == 'a'){
                charCountNew++;
            }
        }
        System.out.println("count of character 'a' on String: 'Today is Monday' using for each loop  " + charCountNew);

    }
}
