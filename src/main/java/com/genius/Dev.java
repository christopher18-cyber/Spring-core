package com.genius;

public class Dev {

    private int age;
    private Computer computer;

    Dev(){
        System.out.println("Dev constructor is running.");
    }
    public void build(){
        System.out.println("Working on Awesome project.");
    }

    public void setComputer(Computer computer) {
        this.computer= computer;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setAge(String age) {

    }

    public void setLaptop(Laptop laptop) {
    }
}