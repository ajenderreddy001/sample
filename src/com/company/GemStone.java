package com.company;

import java.util.HashMap;
import java.util.Map;

public class GemStone {

    public  int numberOfMinerals(String[] s){
        String firstString=s[0];
        int firstStringLength=firstString.length();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<firstStringLength;i++){
            if(!map.containsKey(firstString.charAt(i))){
                map.put(firstString.charAt(i),1);
            }
        }
        for(int j=1;j < s.length;j++){
            String nextString=s[j];
            int nextStringLength=nextString.length();
            for(int i=0;i< nextStringLength;i++){
                if(map.containsKey(nextString.charAt(i))){
                    map.replace(nextString.charAt(i),j+1);
                }
            }
            int l=j+1;
            map.entrySet().removeIf(e ->e.getValue() != l);
        }
        return map.keySet().size();
    }
}
