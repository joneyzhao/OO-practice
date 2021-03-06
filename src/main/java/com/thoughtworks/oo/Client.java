package com.thoughtworks.oo;

public class Client {
    public static void main(String[] args){
        //学生作为通知者
        StudentSubject studentSubjectOne = new StudentSubject(2);
        StudentSubject studentSubjectTwo = new StudentSubject(3);

        Student studentOne1 = new Student("AA", 18, 2, studentSubjectOne);
        Student studentOne2 = new Student("FF", 17, 2, studentSubjectOne);
        Teacher teacherOne = new Teacher("JS", 28,2,  studentSubjectOne);

        Student studentTwo1 = new Student("AA", 18, 2, studentSubjectOne);
        Student studentTwo2 = new Student("FF", 17, 2, studentSubjectOne);
        Teacher teacherTwo = new Teacher("JS", 28,2,  studentSubjectOne);

        studentSubjectOne.addObserver(studentOne1);
        studentSubjectOne.addObserver(studentOne2);
        studentSubjectOne.addObserver(teacherOne);

        studentSubjectTwo.addObserver(studentTwo1);
        studentSubjectTwo.addObserver(studentTwo2);
        studentSubjectTwo.addObserver(teacherTwo);

        studentSubjectOne.setNewIntroduceMess("Prov", 20, 2);

        studentSubjectOne.setNewIntroduceMess("Brov", 18, 3);
        studentSubjectTwo.setNewIntroduceMess("Brov", 18, 3);
    }
}
