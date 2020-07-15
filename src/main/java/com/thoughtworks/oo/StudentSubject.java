package com.thoughtworks.oo;

public class StudentSubject extends Subject{
    public String name;
    public int age;
    private int classNumber;

    public StudentSubject(int classNumber){
        this.classNumber = classNumber;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setNewIntroduceMess(String nameNew, int ageNew, int classNumberNew){
        name = nameNew;
        age = ageNew;
        classNumber = classNumberNew;
        introduceSomething();
    }

    public void introduceSomething(){
        super.notifyObserver();
    }
}
