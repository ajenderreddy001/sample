package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
*https://www.hackerrank.com/challenges/weighted-uniform-string/problem
 */
public class WeightedUnifromString {
    private int indexCursor=0;
    private Set<Integer> list;
    private int getCharWeight(char c){
        return c-97+1;
    }
    private int getWeight(String s,int index){
        if(index >= s.length())
            return 0;
        int count=1;
        while(index <= s.length()-2 && s.charAt(index)== s.charAt(index+1)){
            count++;
            index++;
        }
        indexCursor=index+1;
        return count;
    }
    private void foo(String s){
        list=new HashSet<>();
        while (indexCursor < s.length()){
            int baseWeight=getCharWeight(s.charAt(indexCursor));
            int count=getWeight(s,indexCursor);
            while(count != 0){list.add(baseWeight*count);count--;}
        }
        System.out.println(list.toString());
    }
    static String[] weightedUniformStrings(String s, int[] queries) {
        /*
         * Write your code here.
         */
        String[] result=new String[queries.length];
        int i=0;
        WeightedUnifromString w=new WeightedUnifromString();
        w.foo(s);
        if(w.list != null){
            while (i < queries.length){
                if(w.list.contains(queries[i])){
                    result[i]="Yes";
                }
                else {
                    result[i]="No";
                }
                i++;
            }
        }

        return result;
    }
}
