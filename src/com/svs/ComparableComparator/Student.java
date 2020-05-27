package com.svs.ComparableComparator;

import java.util.Comparator;

public class Student implements Comparable<Student> {

    private String studentname;
    private int rollno;
    private int studentage;

    public Student(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }

    public String getStudentname() {
        return studentname;
    }
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public int getStudentage() {
        return studentage;
    }
    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    @Override
    public int compareTo(Student comparestu) {
        int compareage=((Student)comparestu).getStudentage();
        /* For Ascending order*/
        return this.studentage-compareage;

        /* For Descending order do like this */
        //return compareage-this.studentage;
    }

    public static Comparator<Student> studRollNo = new Comparator<Student>() {

        @Override
        public int compare(Student o1, Student o2) {
            int one = o1.getRollno();
            int two = o2.getRollno();
            return one-two;
        }
    };

    public static Comparator<Student> studName = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            String name1 = o1.getStudentname();
            String name2 = o2.getStudentname();
             return name1.compareTo(name2);
        }
    };

    @Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }
}
