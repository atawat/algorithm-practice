package com.craig.learning.algorithm;

/**
 * 质数排列
 * https://leetcode.cn/problems/prime-arrangements/
 */
public class NumPrimeArrangements {
    public int numPrimeArrangements(int n) {
        int primeCount =0;
        for (int i = 2; i <= n; i++) {
            if(isPrime(i)){
                primeCount++;
            }
        }

        return (int)( fac(primeCount) * fac(n-primeCount) % 1000000007);
    }

    private boolean isPrime(int n){
        if(n ==1){
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    private long fac(int n){
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
            res %= 1000000007;
        }
        return res;
    }
}
