package IADS_Work.Theme12;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());

        System.out.println("Factorial(for) from number->" + n + " is " + factorialFor(n));
        System.out.println("Factorial(recursion) from number->" + n + " is " + factorialRecursion(n));
        System.out.println("BigInt Factorial(recursion) from number->" + n + " is " + BIGINTFactorialRecursion(BigInteger.valueOf((long)n)));
    }

    public static long factorialRecursion(int i){
        if(i == 0) return 1;

        return factorialRecursion(i - 1) * i;
    }

    public static BigInteger BIGINTFactorialRecursion(BigInteger i){
        if(i.equals(BigInteger.ZERO)) return BigInteger.ONE;

        return i.multiply(BIGINTFactorialRecursion(i.subtract(BigInteger.ONE)));
    }

    public static long factorialFor(int n) {
        long num = 1;
        for(int i = 1; i <= n; i++) {
            num *= i;
        }
        return num;
    }
}