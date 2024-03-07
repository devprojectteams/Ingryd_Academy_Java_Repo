//package org.example.jk;
//
//import java.io.FileNotFoundException;
//import java.sql.SQLDataException;
//
//public class performBusinessOperation {
//    String doSomething, doMore, doExtra;
//
//    public void tryMethods(String print) {
//        try {
//            doSomething(print); // Pass the argument 'print' to the method
//            doMore(print); // Pass the argument 'print' to the method
//            doExtra(print); // Pass the argument 'print' to the method
//        } catch (SQLDataException | FileNotFoundException e) {
//            System.out.println("Caught an exception: " + e.getMessage());
//            e.initCause(new Exception("Additional information")); // Initialize the cause
//            throw e; // Rethrow the exception with the additional cause
//        }
//    }
//
//    // Define the methods
//    public void doSomething(String message) {
//        System.out.println("doSomething method called with message: " + message);
//    }
//
//    public void doMore(String action) {
//        System.out.println("doMore method called with action: " + action);
//    }
//
//    public void doExtra(String description) {
//        System.out.println("doExtra method called with description: " + description);
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
////package org.example.jk;
////
////import java.io.FileNotFoundException;
////import java.sql.SQLDataException;
////
////public class performBusinessOperation {
////    String doSomething, doMore, doExtra;
////
////    public void tryMethods(String print) {
////        try {
////            doSomething("A message");
////            doMore("Doing Something");
////            doExtra("I am doing Something");
////        } catch (SQLDataException | FileNotFoundException e) {
////            System.out.println(e.getCause());
////        }
////