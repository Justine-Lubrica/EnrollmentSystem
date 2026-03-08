package org.example;

import java.util.*;

public class Main{
    public static void main(String[] args){

        Student ao = new Student();
        ao.setstudentID("20240507");
        ao.setstudentName("Escoffier Subalasekup");
        ao.setprogram("BSIT");

        Student mi = new Student();
        mi.setstudentID("0945043");
        mi.setstudentName("Skirk Malabon");
        mi.setprogram("CITE");

        Course wei = new Course();
        wei.setcourseID("1ß356834");
        wei.setcourseName("Columbina De Ocampo");
        wei.setprogram("IT");

        System.out.println("Student ID: " + ao.getStudentID());
        System.out.println("Student Name: " + ao,getStudentName());
        System.out.println("Program " + ao.getProgram());
        System.out.println("");
        System.out.println("Student ID: " + mi.getStudentID());
        System.out.println("Student Name: " + mi.getStudentname());
        System.out.println("Program: " + mi.getprogram());
        System.out.println("");
        System.out.println("Student ID: " + wei.courseID());
        System.out.println("Student Name: " + wei.courseID());
        System.out.println("Program: " + wei.getprogram());
    }
}