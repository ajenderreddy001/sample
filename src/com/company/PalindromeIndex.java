package com.company;

import java.util.Arrays;
import java.util.List;

/*
*https://www.hackerrank.com/challenges/palindrome-index/problem
 */
public class PalindromeIndex {
    public int palindromeIndex(String s){
        if(s.equals(new StringBuilder(s).reverse().toString())){return -1;}
        for(int i=0;i< s.length();i++){
            String t;
            if((t=(s.substring(0,i)+s.substring(i+1,s.length()))).equals(new StringBuilder(t).reverse().toString())){
                return i;
            }
        }

        return -1;
//        List<Character> list=Arrays.asList(s.chars().mapToObj(c->(char)c).toArray(Character[]::new));
//        list.forEach(System.out::println);
//        return 0;
    }
}
