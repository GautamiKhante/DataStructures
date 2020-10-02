package com.rani.datastructures.recursion;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(recursiveFactorial(3));

        System.out.println(iterativeFactorial(3));
    }

    private static int recursiveFactorial(int number) {
        if (number == 0) {
            return 1;
        }
        return recursiveFactorial(number - 1) * number;
    }

    private static int iterativeFactorial(int number) {

        if (number == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;

    }
}
