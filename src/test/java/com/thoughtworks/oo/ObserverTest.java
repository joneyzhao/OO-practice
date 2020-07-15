package com.thoughtworks.oo;

import org.junit.Test;

public class ObserverTest {
    @Test
    public void should_introduce_relevant_mess_when_change_name(){
        StudentSubject studentSubject = new StudentSubject(2);

        Student student = new Student("AA", 18, 2, studentSubject);
        Teacher teacher = new Teacher("JS", 28, 2, studentSubject);

        studentSubject.addObserver(student);
        studentSubject.addObserver(teacher);

        studentSubject.setNewIntroduceMess("Brov", 18, 2);
    }

    @Test
    public void should_introduce_relevant_mess_to_2class_when_change_classNumber(){
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

        studentSubjectOne.setNewIntroduceMess("Brov", 18, 3);
        studentSubjectTwo.setNewIntroduceMess("Brov", 18, 3);
    }
}
