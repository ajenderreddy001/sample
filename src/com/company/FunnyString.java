package com.company;

public class FunnyString {
    public FunnyString() {
    }
    public String isFunny(String funny){
        int strlen=funny.length();
        for(int i=0; i <  (strlen)/2 ;i++){
            if(Math.abs(funny.charAt(i) - funny.charAt(i+1)) != Math.abs(funny.charAt(strlen-i-1)-funny.charAt(strlen-i-2))){
                return "Not Funny";
            }
        }
        return "Funny";
    }
}
