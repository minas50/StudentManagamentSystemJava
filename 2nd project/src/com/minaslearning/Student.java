package com.minaslearning;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String  studentID;
    private int courses;
    private int  tuitionBalance;
    private static int costOfCourse = 9000;
    private static  int id = 1001;
    private String setCourse = "";


    //constructor that asks for the Students name and year
    public Student() {
        Scanner in = new Scanner(System.in);
            //for the first name

            System.out.println("Enter student first name: ");
             this.firstName = in.nextLine();



            System.out.println("Enter student last name : ");
            this.lastName = in.nextLine();

            // grade year
            System.out.println("Enter student year :\n 1 for 1st year\n 2 for second year\n 3 for final year");
            this.gradeYear = in.nextInt();


            setStudentID();


            //enroll in course
            System.out.println("Enter course to enroll\n press 1 for computer science\n press 2 for Electronic and electical engineering\n press 3 for astrophysics");
            this.courses = in.nextInt();

            enroll();
            System.out.println("Your Name is : " + firstName + " " + lastName + "\n " + "Your are in the " + gradeYear + " year" + " \n " + "your student ID is : " + studentID + " \n " + "your course is " + setCourse);
             System.out.println("   ");



   }

    //Create student ID
    private void setStudentID(){
        //Gradelevel+ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    //Enroll in course
    public String enroll(){
        switch (courses){
            case 1:
                setCourse = "Computer Science";
                break;
            case 2:
                setCourse = "Electronic and electrical engineering";
            break;
            case 3:
                setCourse ="astrophysics";
            break;
            default:
                setCourse = "Non";

        }
        return setCourse;
    }


    //number of students



}
