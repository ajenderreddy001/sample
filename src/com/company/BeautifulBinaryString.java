package com.company;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BeautifulBinaryString {
    public int minChange(String s){
        return (s.length()-s.replaceAll("010","").length())/3;
    }
}

