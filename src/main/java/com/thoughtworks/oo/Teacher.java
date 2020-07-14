package com.thoughtworks.oo;

public class Teacher extends Person{
    private String job;

    public Teacher(String name, int age, StudentSubject studentSubject) {
        super(name, age, studentSubject);
    }

    public String introduce(String name, int age, String job){
        String returnStr = "My name is " + name + ". I am " + age +" years old. I am a " + job +".";
        return returnStr;
    }

    public String introduceUpdate() {
        System.out.println("进入教师introduceUpdate");
        String returnStr = "My name is " + studentSubject.getName() + ". I am " + studentSubject.getAge() + " years old. I am a Student of Class "+ studentSubject.getClassNumber() +"now.";
        System.out.println(returnStr);
        return returnStr;
    }

}
