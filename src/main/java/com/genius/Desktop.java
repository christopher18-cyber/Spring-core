package com.genius;

public class Desktop implements Computer {
    Desktop(){
        System.out.println("Desktop constructor is running.");
    }
    public void compile(){
        System.out.println("Compiling in Desktop.");
    }
}
