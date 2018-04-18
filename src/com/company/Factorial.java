package com.company;

import java.math.BigInteger;
import java.util.concurrent.TimeoutException;

public class Factorial {
    private static final int timeLimitInSeconds = 5;

    public Factorial(int n) {
        try {
            if (n > 0) {
                BigInteger bigInteger = BigInteger.ONE;
                long start = System.currentTimeMillis();
                for (int i = n; i != 0; i--) {
                    bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
                    if ((System.currentTimeMillis() - start) / 1000F >= timeLimitInSeconds) {
                        throw new TimeoutException("Factorial of " + n + " is taking more than " + timeLimitInSeconds + " seconds");
                    }
                }
                Integer result = bigInteger.intValue();
                BigInteger res = BigInteger.valueOf(result);

                System.out.println("Factorial of " + n + " is: " + bigInteger);
                System.out.println("The ByteCount in this big integer is " + bigInteger.toByteArray().length);
                System.out.println("----The Byte Array in binary----");
                for (byte eachByte : bigInteger.toByteArray()) {
                    System.out.print(String.format("%8s\t", Integer.toBinaryString(eachByte & 0xFF)).replace(' ', '0'));
                }
                System.out.println();
                System.out.println("--------------------------------");
                System.out.println("The binary string is " + bigInteger.toString(2));
                System.out.println("int conversion is " + result);
                System.out.println("int binary string of Integer with lowest 32 bits " + res.toString(2));
            } else if (n == 0) {
                System.out.println("Factorial of " + n + " is: 1");
            } else {
                throw new IllegalStateException("Factorial for Negative Integer is Illegal. " + n);

            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            return;

        }
    }
}
