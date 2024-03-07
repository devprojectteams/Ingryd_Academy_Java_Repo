//package org.example.week1;
//
//import java.util.Scanner;
//
//public class ShapesCalculator {
//    private double radius;
//    private double length;
//    private double breadth;
//    private double height;
//
//
//
//    // Default constructor
//    public ShapesCalculator() {
//        // Initialize variables if needed in the default constructor
//    }
//
//    // Parameterized constructor
//    public ShapesCalculator(double radius, double length, double breadth, double height) {
//        this.radius = radius;
//        this.length = length;
//        this.breadth = breadth;
//        this.height = height;
//    }
//
//    // Overloaded method to calculate area of a circle
//    public double calculateArea(double radius) {
//        return Math.PI * Math.pow(radius, 2);
//    }
//
//    // Overloaded method to calculate area of a triangle
//    public double calculateArea(double base, double height) {
//        return 0.5 * base * height;
//    }
//
//    // Overloaded method to calculate area of a rectangle
//    public double calculateArea(double length, double breadth) {
//        return length * breadth;
//    }
//
//    // Overloaded method to calculate area of a square
//    public double calculateArea(double side) {
//        return Math.pow(side, 2);
//    }
//
//    // Overloaded method to calculate area of a cylinder
//    public double calculateArea(double radius, double height) {
//        return 2 * Math.PI * radius * (radius + height);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter 1 for Circle, 2 for Triangle, 3 for Rectangle, 4 for Square, 5 for Cylinder:");
//        int choice = scanner.nextInt();
//
//        ShapesCalculator shape = new ShapesCalculator(); // Use the default constructor
//
//        switch (choice) {
//            case 1 -> {
//                System.out.println("Enter radius of the circle:");
//                double circleRadius = scanner.nextDouble();
//                System.out.println("Area of Circle: " + shape.calculateArea(circleRadius));
//            }
//            case 2 -> {
//                System.out.println("Enter base and height of the triangle:");
//                double triangleBase = scanner.nextDouble();
//                double triangleHeight = scanner.nextDouble();
//                System.out.println("Area of Triangle: " + shape.calculateArea(triangleBase, triangleHeight));
//            }
//            case 3 -> {
//                System.out.println("Enter length and breadth of the rectangle:");
//                double rectangleLength = scanner.nextDouble();
//                double rectangleBreadth = scanner.nextDouble();
//                System.out.println("Area of Rectangle: " + shape.calculateArea(rectangleLength, rectangleBreadth));
//            }
//            case 4 -> {
//                System.out.println("Enter side of the square:");
//                double squareSide = scanner.nextDouble();
//                System.out.println("Area of Square: " + shape.calculateArea(squareSide));
//            }
//            case 5 -> {
//                System.out.println("Enter radius and height of the cylinder:");
//                double cylinderRadius = scanner.nextDouble();
//                double cylinderHeight = scanner.nextDouble();
//                System.out.println("Area of Cylinder: " + shape.calculateArea(cylinderRadius, cylinderHeight));
//            }
//            default -> System.out.println("Invalid choice. Please enter a number between 1 and 5.");
//        }
//
//        scanner.close();
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
//
//
//
//
//
//
//
//
////package org.example.week1;
////
////import java.util.Scanner;
////
////public class ShapesCalculator {
////
////    private double radius;
////    private double length;
////    private double breadth;
////    private double height;
////
////    // Default constructor
////    public ShapesCalculator() {
////        // Initialize variables if needed
////    }
////
////    // Parameterized constructor to set shape dimensions
////    public ShapesCalculator(double radius, double length, double breadth, double height) {
////        this.radius = radius;
////        this.length = length;
////        this.breadth = breadth;
////        this.height = height;
////    }
////
////    // Setters for shape dimensions (optional)
////    public void setRadius(double radius) {
////        this.radius = radius;
////    }
////
////    public void setLength(double length) {
////        this.length = length;
////    }
////
////    public void setBreadth(double breadth) {
////        this.breadth = breadth;
////    }
////
////    public void setHeight(double height) {
////        this.height = height;
////    }
////
////    // Overloaded calculateArea methods with distinct parameter types
////    public double calculateCircleArea() {
////        if (radius <= 0) {
////            throw new IllegalArgumentException("Radius cannot be zero or negative.");
////        }
////        return Math.PI * Math.pow(radius, 2);
////    }
////
////    public double calculateTriangleArea(double base, double height) {
////        if (base <= 0 || height <= 0) {
////            throw new IllegalArgumentException("Base and height cannot be zero or negative.");
////        }
////        return 0.5 * base * height;
////    }
////
////    public double calculateRectangleArea(double length, double breadth) {
////        if (length <= 0 || breadth <= 0) {
////            throw new IllegalArgumentException("Length and breadth cannot be zero or negative.");
////        }
////        return length * breadth;
////    }
////
////    public double calculateSquareArea(double side) {
////        if (side <= 0) {
////            throw new IllegalArgumentException("Side cannot be zero or negative.");
////        }
////        return Math.pow(side, 2);
////    }
////
////    public double calculateCylinderArea(double radius, double height) {
////        if (radius <= 0 || height <= 0) {
////            throw new IllegalArgumentException("Radius and height cannot be zero or negative.");
////        }
////        return 2 * Math.PI * radius * (radius + height);
////    }
////
////    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////
////        System.out.println("Enter 1 for Circle, 2 for Triangle, 3 for Rectangle, 4 for Square, 5 for Cylinder:");
////        int choice = scanner.nextInt();
////
////        ShapesCalculator shape;
////
////        switch (choice) {
////            case 1:
////                System.out.println("Enter radius of the circle:");
////                double circleRadius = scanner.nextDouble();
////                shape = new ShapesCalculator(circleRadius, 0, 0, 0); // Set other dimensions to 0
////                System.out.println("Area of Circle: " + shape.calculateCircleArea());
////                break;
////            case 2:
////                System.out.println("Enter base and height of the triangle:");
////                double triangleBase = scanner.nextDouble();
////                double triangleHeight = scanner.nextDouble();
////                shape = new ShapesCalculator(0, triangleBase, triangleHeight, 0); // Set other dimensions to 0
////                System.out.println("Area of Triangle: " + shape.calculateTriangleArea(triangleBase, triangleHeight));
////                break;
////            case 3:
////                System.out.println("Enter length and breadth of the rectangle:");
////                double rectangleLength = scanner.nextDouble();
////                double rectangleBreadth = scanner.nextDouble();
////                shape = new ShapesCalculator(0, rectangleLength, rectangleBreadth, 0); // Set other dimensions to 0
////                System.out.println("Area of Rectangle: " + shape.calculateRectangleArea(rectangleLength, rectangleBreadth));
////                break;
////            case 4:
////                System.out.println("Enter side of the square:");
////                double squareSide = scanner.nextDouble();
////                shape = new ShapesCalculator(0, squareSide, squareSide, 0); // Set other dimensions to 0
////                System.out.println("Area of Square: " + shape.calculateSquareArea(squareSide));
////                break;
////            case 5:
////                System.out.println("Enter radius and height of the cylinder:");
////                double cylinderRadius = scanner.nextDouble();
////                double cylinderHeight = scanner.nextDouble();
////                System.out.println("Area of Cylinder: " + shape.calculateArea(cylinderRadius, cylinderHeight));
////
////        default -> System.out.println("Invalid choice. Please enter a number between 1 and 5.");
////    }
////
////        scanner.close();
////}
////}
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
//
//
//
//
//
//
