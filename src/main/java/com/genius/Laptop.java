package com.genius;

public class Laptop implements Computer {

    Laptop(){
        System.out.println("Laptop constructor is running.");
    }
    public void compile(){
        System.out.println("Compiling i Laptop.");
    }
}