package com.thoughtworks.oo;

public class StudentSubject extends Subject {
    public String name;
    public int age;
    private int classNumber;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public void introduceSomething(){
        super.notifyObserver();
    }
}
