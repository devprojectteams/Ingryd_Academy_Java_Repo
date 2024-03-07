package org.example.week2;

public class TwoStringManipulation {
    public static void main(String[] args) {

        // Initialize two strings
        String str1 = "Hello";
        String str2 = "World";

        // Concatenate the strings with a comma
        String concatenatedString = str1 + "," + str2;
        System.out.println("Here is the concatenated Strings -> " +concatenatedString);

        // Split the concatenated string using the split() method
        String[] splitStrings = concatenatedString.split(",");

        // Print the split strings
        for (String str : splitStrings) {
            System.out.println("Split String: " + str);
        }
    }
}
