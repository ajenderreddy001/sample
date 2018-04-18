package com.company;

public class StringRotation {
    public boolean isStringRotation(String orginal,String rotated){
        if(orginal ==null || rotated == null || orginal.length() != rotated.length())
            return false;
        return (rotated+rotated).contains(orginal);
    }
}
