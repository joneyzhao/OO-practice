package com.thoughtworks.oo;

public class Teacher extends Person{
    private String job;

    public Teacher(String name, int age, int classNumber, StudentSubject studentSubject) {
        super(name, age, classNumber, studentSubject);
    }

    public String introduce(String job){
        String returnStr = "My name is " + name + ". I am " + age +" years old. I am a " + job +".";
        return returnStr;
    }

    public String introduceUpdate() {
        System.out.println("进入" + this.classNumber + "班,教师的introduceUpdate");
        String returnStr = "My name is " + studentSubject.getName() + ". I am " + studentSubject.getAge() + " years old. I am a Student of Class "+ studentSubject.getClassNumber() +"now.";
        System.out.println(returnStr);
        return returnStr;
    }

}
