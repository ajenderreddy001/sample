package com.company;

/*
*https://www.hackerrank.com/challenges/mars-exploration/problem
 */
public class MarsExploration {
public static int numberOfAltered(String message){
    int count=0;
    for (int i =0 ;i< message.length();i=i+3){
        if(!"SOS".equals(message.substring(i,i+3))){
            if(message.charAt(i) != 'S')
                count++;
            if(message.charAt(i+1) != 'O')
                count++;
            if(message.charAt(i+2) != 'S')
                count++;
        }
    }
    return count;
}
}

