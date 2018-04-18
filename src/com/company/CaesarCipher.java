package com.company;
/*
*https://www.hackerrank.com/challenges/caesar-cipher-1/problem
 */
public class CaesarCipher {
    public static String rotate(String original,int rotateBy){
        if(original == null || original.length()==0)
            return "";
        StringBuffer buffer=new StringBuffer(original);
        rotateBy=rotateBy%26;
        for(int i=0;i<buffer.length();i++){

            if(buffer.charAt(i) >= 65 && buffer.charAt(i) <= 65+25){
                char c=(char) (buffer.charAt(i)-65);
                buffer.setCharAt(i,(char)( 65+(c+rotateBy)%26));
            }
            if(buffer.charAt(i) >= 97 && buffer.charAt(i) <= 97+25){
                char c=(char) (buffer.charAt(i)-97);
                buffer.setCharAt(i,(char)( 97+(c+rotateBy)%26));
            }
        }
        return buffer.toString();
    }
}
