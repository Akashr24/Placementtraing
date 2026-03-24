package com.beans;

public class Student {
    private int regno;
    private String Name;
    private Address address;

    public Student(int regno, String Name, Address address) {
        this.regno = regno;
        this.Name = Name;
        this.address = address;
    }

    public void display() {
        System.out.println("Student Regno: " + regno);
        System.out.println("Student Name: " + Name);
        System.out.println("Student Address: " + address);
    }
}
