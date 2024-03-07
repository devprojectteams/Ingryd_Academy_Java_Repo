package org.example.week1;

public class factorialCalculator {
    public static long calculateFactorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
        factorial *= i;
    }

        return factorial;
}

    public static void printFactorials(int... numbers) {
        for (int number : numbers) {
            System.out.println("Factorial of " + number + ": " + calculateFactorial(number));
        }
    }

    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 7;

        System.out.println("Factorial of " + number1 + ": " + calculateFactorial(number1));
        System.out.println("Factorial of " + number2 + ": " + calculateFactorial(number2));

        System.out.println("Factorials of " + number1 + " and " + number2 + ":");
        printFactorials(number1, number2);
    }
}
