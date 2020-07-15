package com.thoughtworks.oo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void should_return_student_mess_when_introduce() {
        StudentSubject studentSubject = new StudentSubject(2);

        Student student = new Student("TomFord", 21, 2, studentSubject);
        String studentMess = student.introduce(2);
        assertEquals(studentMess, "My name is TomFord. I am 21 years old. I am a Student of Class 2.");
    }
}
