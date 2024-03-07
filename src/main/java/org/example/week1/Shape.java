package org.example.week1;

public abstract class Shape {
        private int length;
        private double radius;

        public int getLength(){
            return length;
        }

        public double getRadius(){
            return radius;
        }

        public abstract double area();

   // public abstract calculateArea();

}

    class Circle extends Shape{

        @Override
        public double area() {
            return Math.PI * Math.pow(getRadius(), 2);
        }
    }

    class Square extends Shape {


        public double area() {
            return Math.pow(getLength(), 2);
        }
    }

