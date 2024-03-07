package org.example.week1;

import java.util.Scanner;

public class FactorOfNumberCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number that you want to find it's factor");
        long factor = Long.parseLong(scanner.nextLine());
        System.out.println("Factors of " + factor +   " are");
        long result = calculateTheFactorsOfANumber(factor);
//        System.out.println("Factors of " + result + "are");
    }

    protected static long calculateTheFactorsOfANumber(long number){
        for (int i = 1; i <= number; i++){
            if (number % i == 0) {
                System.out.println(String.valueOf(i));
            }
        }
        System.out.println();
        return number;
    }

    // Todo: prompt users to select a method with prompt that calls either of the method.
    // Todo: change Math.min to simpler logic
    public static void printCommonFactors(int number1, int number2) {
        System.out.println("Common factors of " + number1 + " and " + number2 + ":");

        for (int i = 1; i <= Math.min(number1, number2); i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }



}
