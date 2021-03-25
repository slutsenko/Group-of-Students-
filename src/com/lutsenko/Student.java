package com.lutsenko;

import java.time.LocalDate;


public class Student {
    private String name;
    private String surName;
    private LocalDate birthday;
    private String contacts;


    public Student(String name, String surName, int year,int month,int day, String contacts) {
        this.name = name;
        this.surName = surName;
        this.birthday = LocalDate.of(year,month,day);;
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getContacts() {
        return contacts;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", birthday=" + birthday +
                ", contacts=" + contacts +
                '}';
    }
}

