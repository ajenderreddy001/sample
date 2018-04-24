package com.company;

public class PowerSet {
    public void print(int[] A){
    int arrayLength=A.length;
    int powerSetLength= ((int) Math.pow(2, arrayLength));
    for(int i=0;i<powerSetLength;i++){
        System.out.print("{");
        for (int j = 0; j <arrayLength ; j++) {
            if((i & (1<<j)) > 0){
                System.out.print(" "+A[j]+" ");
            }

        }
        System.out.println("}");
    }
    }

}
