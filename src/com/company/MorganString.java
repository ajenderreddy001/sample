package com.company;

import java.util.Stack;

/*
*https://www.hackerrank.com/challenges/morgan-and-a-string/problem
 */
public class MorganString {
    StringBuffer buffer;
    public String minimalLexographical(String jack,String daniel){
        Stack<Character> jackStack=new Stack<>();
        Stack<Character> danielStack=new Stack<>();
        for(int i=jack.length()-1 ; i>-1;i--){
            jackStack.push(jack.charAt(i));
        }
        for(int i=daniel.length()-1 ; i>-1;i--){
            danielStack.push(daniel.charAt(i));
        }
        buffer=new StringBuffer();
        int len=jack.length()<daniel.length()?jack.length():daniel.length();
        while(jackStack.size() != 0 && danielStack.size() != 0){
            if(jackStack.peek() < danielStack.peek()){
                buffer.append(jackStack.pop());
            }
            else if(jackStack.peek() == danielStack.peek()){

                buffer.append(solveConflict(jackStack,danielStack));
            }
            else {
                buffer.append(danielStack.pop());
            }
        }
        if(!jackStack.empty())
        {while (jackStack.size()!=0){buffer.append(jackStack.pop());}}
        if(!danielStack.empty())
        {while (danielStack.size()!=0){buffer.append(danielStack.pop());}}
        return buffer.toString();
    }
    private Character solveConflict(Stack<Character> jackStack,Stack<Character> danielStack){
        int jackIndex=jackStack.indexOf(jackStack.peek());
        int danielIndex=danielStack.indexOf(danielStack.peek());
        while (jackIndex > 0 && danielIndex > 0){
            if(jackStack.get(jackIndex-1) < danielStack.get(danielIndex-1)){
                return jackStack.pop();
            }
            else if(jackStack.get(jackIndex-1) > danielStack.get(danielIndex-1)){
                return danielStack.pop();
            }
            else {
                jackIndex--;
                danielIndex--;
            }
        }
        if(jackIndex <= 0)
            return danielStack.pop();
        else
            return jackStack.pop();

    }
}
