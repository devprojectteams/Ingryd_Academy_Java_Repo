package org.example.week1;

public class Debugging {
    public static void main(String[] args) {
        int x = 10, y = 11;

        //this code prove conversion datatypes and inversion of signed bits types
        //this code changed to long data type the code continues to run
        for (int j= 1; j < y; j-=1000000){
            System.out.println(j);
        }

        while (x <= y){
            System.out.println(x++);
        }

 //       int x = 10, y = 11;
//
//        for (int j= 1; j < y; j--){
//            System.out.println(j);
//        }
//
//        while (x <= x){
//            System.out.println(x++);
//        }
    }
}