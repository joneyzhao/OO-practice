package com.thoughtworks.oo;

public class Client {
    public static void main(String[] args){
        //学生作为通知者
        StudentSubject studentSubject = new StudentSubject();

        Student student = new Student("AA", 18, studentSubject);
        Teacher teacher = new Teacher("JS", 28, studentSubject);

        studentSubject.addObserver(student);
        studentSubject.addObserver(teacher);

        studentSubject.setName("BB");
        studentSubject.introduceSomething();
    }
}
