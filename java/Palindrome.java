package com.company;

import java.util.Objects;

public class Palindrome {

    public Boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuilder sb = new StringBuilder(s);
        String r = sb.reverse().toString();
        return s.equals(r);
    }

    public Boolean isPalindrome2(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while(i < j) {
            while(i < j && !Character.isLetterOrDigit(s.charAt(i)))
                i++;
            while(i < j && !Character.isLetterOrDigit(s.charAt(j)))
                j--;
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome("0P"));
        System.out.println(p.isPalindrome2("p0P"));

//        String s = "";
//        System.out.println(s.charAt(10));   // exception
    }
}
