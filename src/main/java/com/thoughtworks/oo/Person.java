package com.thoughtworks.oo;

public abstract class Person{

    public String name;
    public int age;
    public StudentSubject studentSubject;

//    public Person(String name, int age, StudentSubject studentSubject) {
//        super(name, age, studentSubject);
//    }

    public Person(String name, int age, StudentSubject studentSubject) {
        this.name = name;
        this.age = age;
        this.studentSubject = studentSubject;
    }

    public abstract String introduceUpdate();

    public String introduce(String name, int age){
        String returnStr = "My name is " + name + ". I am " + age + " years old.";
        return returnStr;

    }
}

