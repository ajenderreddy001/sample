package com.company;
/*
*https://www.hackerrank.com/challenges/separate-the-numbers/problem
 */
public class SeperatorTheNumbers {
    private String numString;
    static String yes="YES ";
    static String no="NO";
    public String isBeautiful(String s){
        numString=s;

        if(numString.charAt(0) == '0' || numString.length() == 1)
            return no;
        int cursorSize=1;
        int i,j; i=0;j=cursorSize;
        long a,b;
        boolean flag=false;
        boolean curflag=false;
        while (true){
            if(j+cursorSize > numString.length())
                break;
            if(((a=subtoint(i,i+cursorSize))+1) == (b=subtoint(j,j+cursorSize)))
            {
                i=j;
                j+=cursorSize;
                flag=true;

            }
            else if(((a=subtoint(i,i+cursorSize))+1) == (b=subtoint(j,j+cursorSize+1)))
            {
                cursorSize++;
                i=j;
                j+=cursorSize;
                flag=true;
                curflag=true;
            }
            else {
                cursorSize++;i=0;j=cursorSize;
                flag=false;
                curflag=false;
            }
        }
        if(cursorSize > numString.length()-j)
            flag=false;
        return flag?yes+subtoint(0,curflag?cursorSize-1:cursorSize):no;

    }

    public  long subtoint(int startIndex,int end)
    {
        if(end > numString.length())
            return -1;
        return Long.parseLong(numString.substring(startIndex,end));
    }
    public  String isv2(){
        return "";
    }
}
