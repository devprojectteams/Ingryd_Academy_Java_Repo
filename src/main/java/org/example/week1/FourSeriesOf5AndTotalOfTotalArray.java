package org.example.week1;

import java.util.Arrays;
import java.util.Scanner;

public class FourSeriesOf5AndTotalOfTotalArray {
    public static void main(String[] args) {
        int[] seriesSum = new int[4];
        int totalSum = 0;
        int index = 0;

        int i = 1;
        do {
            int sum = 0;
            for (int j = 1; j <= 5 && i <= 20; j++, i++) {
                sum += i;
            }

            seriesSum[index] = sum;
            totalSum += sum;
            index = (index + 1) % seriesSum.length;
        } while (i <= 20);

        System.out.println("Series Sums:");
        for (int sum : seriesSum) {
            System.out.println(sum);
        }

        System.out.println("\nTotal of each Series: " + totalSum);
        System.out.println("\nCombined Total of all Series Sums: " + Arrays.stream(seriesSum).sum());

    }





}
//    public static void main(String[] args) {
//        int[] seriesTotal = new int[4];
//        Scanner scanner = new Scanner(System.in)
//    }
//}
//for (int i = 0; i < seriesTotal.length; i++){
//    sou
//        }