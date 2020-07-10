package com.thoughtworks.oo;

public class Student extends Person {
    private int classNumber;
    public String introduce(String name, int age, int classNumber){
        String returnStr = "My name is " + name + ". I am " + age + " years old. I am a Student of Class "+ classNumber +".";
        return returnStr;
    }

}
