package com.thoughtworks.oo;

public class Teacher extends Person{
    private String job;
    public String introduce(String name, int age, String job){
        String returnStr = "My name is " + name + ". I am " + age +" years old. I am a " + job +".";
        return returnStr;
    }
}
