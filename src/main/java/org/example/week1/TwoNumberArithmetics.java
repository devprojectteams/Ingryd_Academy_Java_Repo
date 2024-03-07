package org.example.week1;

public class TwoNumberArithmetics {
    public static void main(String[] args) {

        int first = 3;
        int second = 10;

        System.out.println("First plus second: " + (first + second));
        System.out.println("First minus second: " + (first - second));
        System.out.println("First multiply by second: " + (first * second));

        if (second != 0) {
            System.out.println("First divided by second: " + (first / second));
        } else {
            System.out.println("Cannot divide by zero.");
        }

        int max;

        if (first > second) {
            max = first;
        } else {
            max = second;
        }
        System.out.println("Maximum between first and second: " + max);
    }
}
