package org.example;

import java.util.*;

public class Main{
    public static void main(String[] args){

        Student id = new Student();
        id.setStudentID("22045331");
        id.setStudentName("Escoffier");
        id.setProgram("CITE");

        Student cm = new Student();
        cm.setStudentID("024552290");
        cm.setStudentName("Flins");
        cm.setProgram("CITE");

        Course prog = new Course();
        prog.setCourseID("002305409");
        prog.setCourseName("Integrative Programming");
        prog.setProgram("Information Technology");


        System.out.println("Student ID: " + id.getStudentID());
        System.out.println("Student Name: " + id.getStudentName());
        System.out.println("Program: " + id.getProgram());
        System.out.println(" ");
        System.out.println("Student ID: " + cm.getStudentID());
        System.out.println("Student Name: " + cm.getStudentName());
        System.out.println("Program: " + cm.getProgram());
        System.out.println(" ");
        System.out.println("Course ID: " + prog.getCourseID());
        System.out.println("Course Name: " + prog.getCourseName());
        System.out.println("Program: " + prog.getProgram());
    }


}