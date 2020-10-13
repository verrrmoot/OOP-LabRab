package com.company;

public class Palindrome {
    public static void main(String[] args) {
        String [] s = new String []{
                "Madam", "java"
        };
        for (int i = 0; i < s.length; i++) {
            System.out.println("Является ли " + s[i] + " палиндромом?");
            System.out.println("Ответ: " + isPalindrome(s[i]) + "\n");
        }

    }

    public static String reverseString (String s){
       String str = new String();
       for (int i = s.length() - 1; i >= 0; i--){
           str += s.charAt(i);
       }
       return str;
    }

    public static boolean isPalindrome(String s){
        return s.equalsIgnoreCase(reverseString(s));
    }
}
