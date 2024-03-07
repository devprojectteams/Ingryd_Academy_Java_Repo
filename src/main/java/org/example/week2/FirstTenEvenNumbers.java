package org.example.week2;

public class FirstTenEvenNumbers {
    public static void main(String[] args) {
        int[] evenNumbers = new int[10];
        int index = 0;

        for (int i = 2; i <= 20; i += 2) { // Generate even numbers from 2 to 20
            evenNumbers[index++] = i;
        }

        System.out.println("First ten even numbers:");
        for (int number : evenNumbers) {
            System.out.println(number);
        }
    }
}
