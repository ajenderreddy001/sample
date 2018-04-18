package com.company;
/*
* https://www.hackerrank.com/challenges/reduced-string/problem
 */
public class SuperReducedString {
    public SuperReducedString() {
    }
    public String reduce(String s){
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                s=s.substring(0,i-1)+s.substring(i+1);
                i=0;
            }
        }
        if(s.length() == 0){
            return new String("Empty String");
        }
        else {
            return s;
        }
    }
}
