package com.company;

/*
*https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem
 */
public class HackerRankString {
    public static String yesOrNoCommonSubsequence(String sequence,String original){
        for(int i=0,j=0; i < original.length() && j< sequence.length();i++){
            if(original.charAt(i) == sequence.charAt(j)){
                j++;
            }
            else {
                original=original.substring(0,i)+original.substring(i+1);
                i=j-1;
            }
        }

        if(original.contains(sequence))
            return "YES";
        else
            return "NO";
    }
}
