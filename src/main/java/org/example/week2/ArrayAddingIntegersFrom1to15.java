package org.example.week2;

public class ArrayAddingIntegersFrom1to15 {
    public static void main(String[] args) {

        // Create an array to store integers from 1 to 15
        int[] numbers = new int[15];
        for (int i = 0; i < 15; i++) {
            numbers[i] = i + 1;
        }

        // Initialize a variable to store the sum
        final int[] sum = {0};

        // Use forEach loop to sum up all the integers
        java.util.Arrays.stream(numbers).forEach(n -> sum[0] += n);

        // Print the sum
        System.out.println("The sum of integers from 1 to 15 is: " + sum[0]);
    }
}
