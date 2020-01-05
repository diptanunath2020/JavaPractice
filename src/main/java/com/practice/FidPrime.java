package com.practice;

import java.math.BigInteger;

public class FidPrime {

    static boolean checkPrime(long n)
    {
        // Converting long to BigInteger
        BigInteger b = new BigInteger(String.valueOf(n));
        Long.parseLong(b.nextProbablePrime().toString());
        return b.isProbablePrime(1);
    }


    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    static boolean isPrime1(int n)
    {
        // Corner cases
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        // This is checked so that we can skip
        // middle five numbers in below loop
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6) {
            System.out.println(i);
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    static boolean isPrime2(int n) {
        for(int i=2;2*i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    // Driver method
    public static void main (String[] args)
            throws java.lang.Exception
    {
        long n = 7;
        System.out.println(checkPrime(n));
        System.out.println(isPrime(6));

    }
}
