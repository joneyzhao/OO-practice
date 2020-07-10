package com.thoughtworks.oo;

public class Person {
    private String name;
    private int age;

    public String introduce(String name, int age){
        String returnStr = "My name is " + name + ". I am " + age + " years old.";
        return returnStr;

    }
}

