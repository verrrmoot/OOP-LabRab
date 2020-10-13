package com.company;

public class Primes {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        boolean a = false;
        int k = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                k = k + 1;
            }
        }
        if (k == 0){
            a = true;
        }

        return a;
    }
}