package org.example.week1;

import java.util.Scanner;

public class BinaryConverter {

    public static int convertBinaryToDecimal(String typedValue) {
        int lastIndex = typedValue.length() - 1;
        int startIndex = 0;
        int total = 0;

        while (startIndex <= lastIndex) {
            char extracted = typedValue.charAt(startIndex);
            int resultGotFromExtracted = Integer.parseInt(String.valueOf(extracted));
            total += resultGotFromExtracted * Math.pow(2, (lastIndex - startIndex));
            startIndex++;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Binary numbers; strictly 0s and 1s: ");
        String input = scanner.nextLine();
        int convertedFromBinaryToDecimal = convertBinaryToDecimal(input);
        System.out.println(convertedFromBinaryToDecimal);
    }
}
