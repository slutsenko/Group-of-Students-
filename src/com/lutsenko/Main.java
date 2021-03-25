package com.lutsenko;


import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        Group java201 = new Group("JavaBasic", 2021, 1, 1, 4, 2);
        Group qa301 = new Group("QaManual", 2020, 12, 1, 20, 2);

        java201.addStudent(new Student("Tom", "Jerry", 1992, 3, 8, "778"));
        java201.addStudent(new Student("Jack", "Salivan", 1988, 12, 21, "779"));

        java201.searchStudentBySurName("Jerry");

        java201.listOfStudents();

        java201.lastLesson();

        java201.removeStudent("778");

        System.out.println(java201);


    }
}
