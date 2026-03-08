package org.example;

public class Student {
    private String studentID;
    private String studentName;
    private String program;

    public Student() {

    }

    public Student(String studentID, String studentName, String Program) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.program = program;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setstudentID(String studentID) {
        this.studentID = studentID;

    }

    public void setstudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setprogram(String program) {
        this.program = program;
    }
}
