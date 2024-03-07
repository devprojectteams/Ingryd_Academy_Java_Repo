package org.example.week1;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {
        int number = 10;
        int[] inputNumbers = {1, 5, 9};

        System.out.println("Fibonacci of " + number + ": " + fibonacci(number));
        System.out.println("Fibonacci of given numbers: " + Arrays.toString(fibonacci(inputNumbers)));
    }

    // Method for finding Fibonacci numbers of a single user inputted number
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        long previous = 0;
        long current = 1;

        for (int i = 2; i <= n; i++) {
            long temp = current;
            current = previous + current;
            previous = temp;
        }

        return current;
    }

    // Method for finding Fibonacci numbers of two or more numbers inputted by the user
    public static long[] fibonacci(int[] numbers) {
        long[] fibonacciNumbers = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            fibonacciNumbers[i] = fibonacci(numbers[i]);
        }

        return fibonacciNumbers;
    }
}
