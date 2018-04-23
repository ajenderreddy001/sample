package com.company;

/*
*https://www.hackerrank.com/challenges/pangrams/problem
 */
public class Pangrams {
    public Pangrams(String s){

    }
    public static String isPangram(String original)
    {
        original=original.trim().toLowerCase();
        for(int i=0;i<26;i++){
            if(!original.contains(((char)(97+i))+""))
                return "not pangram";
        }
        return "pangram";
    }
}
