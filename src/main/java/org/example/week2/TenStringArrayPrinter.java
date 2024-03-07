package org.example.week2;

public class TenStringArrayPrinter {
    public static void main(String[] args) {
        String[] stringsArray = new String[] { "apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew", "kiwi", "lemon" };

        System.out.println("1st string: " + stringsArray[0]);
        System.out.println("5th string: " + stringsArray[4]);
        System.out.println("Last string: " + stringsArray[stringsArray.length - 1]);
    }
}
