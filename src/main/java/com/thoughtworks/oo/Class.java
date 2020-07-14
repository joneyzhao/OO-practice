package com.thoughtworks.oo;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private Teacher teacher;
    private List observersList = new ArrayList();

    public void attachStudent(Student student) {
        observersList.add(student);
    }

    public void getObserversList(Teacher teacher){
        observersList.add(teacher);
    }

}
