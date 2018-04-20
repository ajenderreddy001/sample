package com.company;

public class AlternatingCharacters {
    public int minimumDeletions(String s){
        int mindel=0;
        for(int i=0;i< s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                mindel++;
            }
        }
        return mindel;
    }
}
