package org.example.CodingChallenges;

import java.util.Scanner;

public class findTheDifferenceInCharOf2Strings {

    static char result = '\0';

    public static char findTheDifference(String s, String t) {
        for (int i = 0; i < t.length(); i++) {
            result = t.charAt(i);
            if (s.contains(result + "")) {
                continue;
            }
            break;
        }
        return result;
    }

//    public static char findTheDifference(String s, String t){
//        for( int i = 0; i < t.length(); i++ ){
//            result = t.charAt(i);
//            if( s.contains( result + "" )){
//                continue;
//            }
//            break;
//        }
//        return result;
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string - s");
        String s = scanner.nextLine();
        System.out.println("Enter the second string - t");
        String t = scanner.nextLine();
        System.out.println(findTheDifference(s, t));

//    static char result = '\0';
//
//    public static char findTheDifference(String s, String t){
//        for (int i = 0; i < t.length(); i++){
//            result = t.charAt(i);
//            if(s.contains(result +""))
//        }
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the first String - s");
//        String s = scanner.nextLine();
//        System.out.println("Enter the second String - t");
//        String t = scanner.nextLine();
//        System.out.println(findTheDifference(s,t));
//
//    }
    }
}