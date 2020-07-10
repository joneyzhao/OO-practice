package com.thoughtworks.oo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void should_return_student_mess_when_introduce() {
        Student tom = new Student();
        String studentMess = tom.introduce("TomFord", 21, 2);
        assertEquals(studentMess, "My name is TomFord. I am 21 years old. I am a Student of Class 2.");
    }
}
