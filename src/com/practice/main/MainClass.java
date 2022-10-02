package com.practice.main;

public class MainClass{
    public static void main(String args[]){
        Parent p = new Child();
        System.out.println(p.i);
    }
}

class Parent{
    int i = 10;
}

class Child extends Parent{
    int i = 20;
}