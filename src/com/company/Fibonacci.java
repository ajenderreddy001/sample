package com.company;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    Map<Long,Long> map=new HashMap<>();

    public Fibonacci() {
        map.put(0l,0l);
        map.put(1l,1l);
    }
    public long fiboByMemorization(long n){
        if(!map.containsKey(n)) {
            Long l= fiboByMemorization(n-1)+ fiboByMemorization(n-2);
            map.put(n,l);
            return map.get(n);
        }
        else {
            return map.get(n);
        }

    }
    public int fib(int n)
    {
        if ( n <= 1 )
            return n;
        return fib(n-1) + fib(n-2);
    }

    public long fibo(long n){
        long f1=0;
        long f2=1;
        long temp=f2;
        for (int i=2;i<=n;i++){
            f2=f1+f2;
            f1=temp;
            temp=f2;
        }

        return n==0?f1:f2;
    }

    @Override
    protected void finalize() throws Throwable {
        map.clear();
        super.finalize();
    }
    //    if (lookup[n] == NIL)
//    {
//        if (n <= 1)
//            lookup[n] = n;
//        else
//            lookup[n] = fib(n-1) + fib(n-2);
//    }
//    return lookup[n];

}
