package com.company;

import java.util.Arrays;
import java.util.stream.Stream;

public class Anagram {
    public int anagram(String s){
        int[] A=new int[26];
        int[] B=new int[26];
        Arrays.fill(A,0);
        Arrays.fill(B,0);
        if(s.length()%2 == 1)
            return -1;
        String a=s.substring(0,s.length()/2);
        String b=s.substring(s.length()/2,s.length());
        a.chars().forEach(i->{
            A[i-97]++;
        });
        b.chars().forEach(i->{
            B[i-97]++;
        });
        for (int i = 0; i < A.length; i++) {
            A[i]=Math.abs(A[i]-B[i]);
        }
        return Arrays.stream(A).sum()/2;
    }

    public int makingAnagrams(String s1,String s2){
        int[] A=new int[26];
        int[] B=new int[26];
        Arrays.fill(A,0);
        Arrays.fill(B,0);
        s1.chars().forEach(i->{
            A[i-97]++;
        });
        s2.chars().forEach(i->{
            B[i-97]++;
        });
        for (int i = 0; i < A.length; i++) {
            A[i]=Math.abs(A[i]-B[i]);
        }
        return Arrays.stream(A).sum();
    }

    public String gameOfThrones(String s){
        int[] A=new int[26];
        Arrays.fill(A,0);
        s.chars().forEach(i->{
            A[i-97]++;
        });
        int odd=0;
        for (int i : A) {
            if(i%2==1)
                odd++;
            if(odd >1)
                break;
        }

        return odd == 0 || odd == 1?"YES":"NO";
    }
    public String twoStrings(String s1,String s2){
        int[] A=new int[26];
        Arrays.fill(A,0);
        s1.chars().forEach(i->{
            A[i-97]++;
        });
        int[] B=s2.chars().toArray();
        boolean sub=false;
        for (int i : B) {
            if(A[i-97] != 0)
            {sub=true;break;}
        }

        return sub?"YES":"NO";
    }
}
