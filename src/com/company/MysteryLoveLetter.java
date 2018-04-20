package com.company;


public class MysteryLoveLetter {
    public long minimum(String s){
        long minOp=0;
        for(long i=0;i< s.length()/2;i++){
            minOp+=Math.abs(s.charAt((int) i)-s.charAt(s.length()-1-(int)i));
        }
        return minOp;
    }
}
//    abc
//            abcba
//    abcd
//            cba
//2
//0
//4
//2