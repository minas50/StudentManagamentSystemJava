package com.minaslearning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //ask how many users we want to add
        System.out.println("Enter the number of students you want to enroll: ");
        Scanner in = new Scanner (System.in);
        int numberOfStudents = in.nextInt();
        Student[] students = new Student[numberOfStudents];

        for (int n =0; n<numberOfStudents; n++){
            Student stu = new Student();
        }

    }
}
