package com.beans;

public class Student {
    private int regno;
    private String Name;
    private Address address;

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display() {
        System.out.println("Student Regno: " + regno);
        System.out.println("Student Name: " + Name);
        System.out.println("Student Address: " + address);
    }
}
