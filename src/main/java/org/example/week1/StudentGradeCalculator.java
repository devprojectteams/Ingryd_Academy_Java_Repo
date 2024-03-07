//package org.example.week1;
//
//
//
//
//
//
//
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Scanner;
//
//public class StudentGradeCalculator {
//    private final String firstName;
//    private final String lastName;
//    private String course;
//    private char grade;
//    private final int score;
//
//    public StudentGradeCalculator(String firstName, String lastName, String course, int score) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.score = score;
//        this.grade = calculateGrade(score);
//    }
//
//    private char calculateGrade(int score) {
//        char grade;
//        if (score >= 90) {
//            grade = 'A';
//        } else if (score >= 80) {
//            grade = 'B';
//        } else if (score >= 70) {
//            grade = 'C';
//        } else if (score >= 60) {
//            grade = 'D';
//        } else {
//            grade = 'F';
//        }
//        return grade;
//    }
//
//    public String displayStudentInfo() {
//        return "First Name: " + firstName + "\n" +
//                "Last Name: " + lastName + "\n" +
//                "Course: " + course + "\n" +
//                "Grade: " + grade + "\n" +
//                "Score: " + score + "\n";
//    }
//
//    public String menu(String input){
//        switch (input):
//        case 1 ->
//            if(input) = "1"
//                break;
//            case 2 ->
//                if(input) = "2"
//        calculateGrade(int score);
//                case 3 ->
//                    if(input) = "3"
//                case 4 ->
//                    if(input) = "4"
//        displayStudentInfo();
//                    else:
//                        menu();
//
//    }
//
//    public static void main(String[] args) {
//        ArrayList<StudentGradeCalculator> students = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("\nPress 1 to add a new student, 2 to calculate grades for existing students, or 'q' to quit:");
//            String choice = scanner.nextLine();
//            if (choice.equalsIgnoreCase("q")) {
//                break;
//            } else if (choice.equalsIgnoreCase("1")) {
//                System.out.println("Enter student details one by one (first name, last name, course, score):");
//                while (true) {
//                    System.out.print("First Name: ");
//                    String firstName = scanner.nextLine();
//                    if (firstName.equalsIgnoreCase("exit")) {
//                        break;
//                    }
//
//                    System.out.print("Last Name: ");
//                    String lastName = scanner.nextLine();
//
//                    System.out.print("Course: ");
//                    String course = scanner.nextLine();
//
//                    System.out.print("Score: ");
//                    int score = Integer.parseInt(scanner.nextLine());
//
//                    StudentGradeCalculator student = new StudentGradeCalculator(firstName, lastName, course, score);
//                    students.add(student);
//                }
//            } else if (choice.equalsIgnoreCase("2")) {
//                System.out.println("\nStudent Information:");
//                students.forEach(student -> {
//                    student.displayStudentInfo();
//                    student.grade = student.calculateGrade(student.score);
//                });
//
//                Collections.sort(students, new Comparator<StudentGradeCalculator>() {
//                    @Override
//                    public int compare(StudentGradeCalculator s1, StudentGradeCalculator s2) {
//                        return s2.score - s1.score;
//                    }
//                });
//
//                for (int i = 0; i < students.size(); i++) {
//                    System.out.println("Rank " + (i + 1) + ": " + students.get(i).displayStudentInfo());
//                }
//            } else {
//                System.out.println("Invalid option. Please try again.");
//            }
//        }
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
////import java.util.ArrayList;
////import java.util.Scanner;
////
////public class StudentGradeCalculator {
////    private String firstName;
////    private String lastName;
////    private String course;
////    private char grade;
////    private final int score;
////
////    public StudentGradeCalculator(String firstName, String lastName, String course, int score) {
////        this.firstName = firstName;
////        this.lastName = lastName;
////        this.score = score;
////        this.grade = calculateGrade(score);
////    }
////
////    private char calculateGrade(int score) {
////        char grade;
////        if (score >= 90) {
////            grade = 'A';
////        } else if (score >= 80) {
////            grade = 'B';
////        } else if (score >= 70) {
////            grade = 'C';
////        } else if (score >= 60) {
////            grade = 'D';
////        } else {
////            grade = 'F';
////        }
////        return grade;
////    }
////
////    public void displayStudentInfo() {
////        System.out.println("First Name: " + firstName);
////        System.out.println("Last Name: " + lastName);
////        System.out.println("Course: " + course);
////        System.out.println("Grade: " + grade);
////        System.out.println("Score: " + score);
////    }
////
////    public static void main(String[] args) {
////        ArrayList<StudentGradeCalculator> students = new ArrayList<>();
////        Scanner scanner = new Scanner(System.in);
////
////        System.out.println("Enter student details one by one (first name, last name, course, score):");
////        while (true) {
////            System.out.print("First Name: ");
////            String firstName = scanner.nextLine();
////            if (firstName.equalsIgnoreCase("exit")) {
////                break;
////            }
////
////            System.out.print("Last Name: ");
////            String lastName = scanner.nextLine();
////
////            System.out.print("Course: ");
////            String course = scanner.nextLine();
////
////            System.out.print("Score: ");
////            int score = Integer.parseInt(scanner.nextLine());
////
////            StudentGradeCalculator student = new  StudentGradeCalculator(firstName, lastName, course, score);
////            students.add(student);
////        }
////
////        System.out.println("\nStudent Information:");
////        for (StudentGradeCalculator student : students) {
////            student.displayStudentInfo();
////        }
////    }
////
////}
