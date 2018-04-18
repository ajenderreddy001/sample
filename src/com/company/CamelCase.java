package com.company;

/*
*https://www.hackerrank.com/challenges/camelcase/problem
 */
public class CamelCase {
    public int numberOfWords(String s){
        if(s == null || s.length() ==0)
            return 0;
        int count=0;
        for(int i=0;i < s.length();i++){
            if(s.charAt(i) >= 65 && s.charAt(i) <= 65+25){
                count++;
            }
        }
        return count+1;
    }
}
