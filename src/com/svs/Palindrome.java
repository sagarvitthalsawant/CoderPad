package com.svs;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("NITIN"));
        System.out.println(isPalindromeReverseTheString("jknklnkljnlm"));

        int palindrome = 121, originalNumber = 121;
        int reverse = 0;
        while (palindrome!=0){
            int remainder = palindrome%10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome/10;
        }
        System.out.println(reverse);
        if (originalNumber == reverse) {
            System.out.println("This is Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }

    }

    public static boolean isPalindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }

    public static boolean isPalindromeReverseTheString(String text) {
        StringBuilder reverse = new StringBuilder();
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        char[] plain = clean.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            reverse.append(plain[i]);
        }
        return (reverse.toString()).equals(clean);
    }
}
