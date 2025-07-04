/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 * Student class that extends Human class
 * Represents a student with basic human properties plus academic information
 * @author MoaathAlrajab
 */
public class Student extends Human {

    // GPA field to store the student's grade point average
    private double gpa;
    // Address field for the student
    private String address;

    public Student(String name, short age) {
        // Call the parent class (Human) constructor
        super(name, age);
        this.gpa = 0.0; // Default GPA
    }

    public Student(String name, short age, double gpa) {
        // Call the parent class (Human) constructor
        super(name, age);
        this.gpa = gpa;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     * Override toString method to provide a string representation of the Student
     * @return String representation of the student
     */
    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gpa=" + gpa +
                ", address='" + address + '\'' +
                '}';
    }
}