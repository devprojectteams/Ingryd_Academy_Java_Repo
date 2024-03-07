package org.example.week1;

import java.util.Scanner;

public class PowerCalculatorOfAGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number that you want calculate it's power");
        int base = Integer.parseInt(scanner.nextLine());
        System.out.println("please enter the exponent of that number");
        int  exponent = Integer.parseInt(scanner.nextLine());
        long powerOf = calculatePoOfANumber(base, exponent);
        System.out.println(powerOf);

    }

    private static long calculatePoOfANumber(int base, int exponent) {
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
}









