package org.example.week2;

public class GenericsMethodDemo {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{3, 5, 30, 45, 50};
        Double[] doubleArray = {4.5, 5.0, 25.6, 3.9, 4.7};
        Character[] characters = {'A', 'B', 'y', '0', 'm'};
        String[] stringArray = new String[]{"Joy", "Man", "Woman", "Stop"};

        printArray(intArray);
        printArray(doubleArray); // You can also use printArray without specifying the type here
        printArray(characters);
        printArray(stringArray);
    }


//    public static void printArray(Integer[] array){
//        for(Integer integer: array){
//            System.out.println(integer);
//        }
//        public static void printArray(Double[] array){
//            for(Double double: array){
//                System.out.println(double);
//            }
//        }
//        public static void printArray(Character[] array){
//            for (Character character : array) {
//                System.out.println(character);
//            }
//        }
//
//        public static <T> void printArray(<T>[] joe){
//            for (T element : array) {
//                System.out.println(element);
//            }
//        }
//
//        public static void main(String[] args){
//            Integer[] intArray = new Integer[]{3,5,30,45,50};
//            Double[] doubleArray = {4.5, 5.0, 25.6, 3.9, 4.7};
//            Character[] characters = {'A', 'B', 'y', '0', 'm'};
//            String[] stringArray = new String[]{"Joy", "Man", "Woman", "Stop"};
//            printArray(intArray);
//            printArray(characters);
//            printArray(stringArray);
//
//        }
//    }
}
