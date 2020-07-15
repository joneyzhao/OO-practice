package com.thoughtworks.oo;


public class Student extends Person {

    private int classNumber;

    public Student(String name, int age, int classNumber, StudentSubject studentSubject) {
        super(name, age, classNumber, studentSubject);
    }

    public String introduce(int classNumber){
        String returnStr = "My name is " + name + ". I am " + age + " years old. I am a Student of Class "+ classNumber +".";
        return returnStr;
    }

    public String introduceUpdate() {
        System.out.println("进入学生introduceUpdate");
        String returnStr = "My name is " + studentSubject.getName() + ". I am " + studentSubject.getAge() + " years old. I am a Student of Class "+ studentSubject.getClassNumber() +"now.";
        System.out.println(returnStr);
        return returnStr;
    }

}
