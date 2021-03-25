package com.lutsenko;


import java.time.LocalDate;
import java.util.*;

public class Group {
    private String nameOfCourses;
    private LocalDate beginning;
    private int numberOfLessons;
    private int lessonsPerWeek;
    private List<Student> students;


    public Group(String nameOfCourses, int year, int month, int day, int numberOfLessons, int lessonsPerWeek) {
        this.nameOfCourses = nameOfCourses;
        this.beginning = LocalDate.of(year, month, day);
        this.numberOfLessons = numberOfLessons;
        this.lessonsPerWeek = lessonsPerWeek;
        this.students = new ArrayList<Student>();

    }

    public boolean addStudent(Student student) {
        students.add(student);
        return true;
    }


    public void searchStudentBySurName(String surName) {
        String groupStudents = students.toString();
        if (groupStudents.contains(surName)) {
            System.out.println("In group " + this.nameOfCourses + " student has the same surname");
        } else {
            System.out.println("In group " + this.nameOfCourses + " any student has the same surname");
        }
    }

    public void listOfStudents() {
        int i = 1;

        for (Student student : students) {
            if (i >= 1) {
                System.out.println(i + "." + Character.toUpperCase(student.getName().charAt(0)) + "." + " " + student.getSurName());
            }
            i++;
        }
    }

    public void lastLesson() {
        LocalDate date = beginning;
        date = date.plusWeeks(numberOfLessons / lessonsPerWeek);
        System.out.println(date);
    }

    public void removeStudent(String surNameOrContact) {
        students.removeIf(student -> student.getSurName().contains(surNameOrContact));
        students.removeIf(student -> student.getContacts().contains(surNameOrContact));
    }



    @Override
    public String toString() {
        return "Group{" +
                "name='" + nameOfCourses + '\'' +
                ", beginning='" + beginning + '\'' +
                ", numberOfLessons=" + numberOfLessons +
                ", lessonsPerWeek=" + lessonsPerWeek +
                ", students=" + students +
                '}';
    }
}

