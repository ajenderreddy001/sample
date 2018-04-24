package com.company;

import com.google.common.base.Ascii;
import com.google.common.base.Joiner;

import java.util.Arrays;

public class BitManipulation {
    public long flipBits(long num){
        System.out.println(Long.toString(num,16).toUpperCase());
        num=~num;
        num=((num)<<32)>>>32;
        System.out.println(Long.toString(num,16).toUpperCase());
        //return num;
        System.out.println(Joiner.on(",").skipNulls().join(Arrays.asList(1,2,3,4,num,null,32)));
        return num;
    }
//    public int maximiseXOR(int a ,int b){
//
//    }
}
