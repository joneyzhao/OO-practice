package com.thoughtworks.oo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeacherTest {
    @Test
    public void should_return_teacher_mess_when_introduce(){
        StudentSubject studentSubject = new StudentSubject(2);
        Teacher teacher = new Teacher("Matt", 30, 2, studentSubject);
        String teacherMess = teacher.introduce("Teacher");
        assertEquals(teacherMess, "My name is Matt. I am 30 years old. I am a Teacher.");
    }
}
