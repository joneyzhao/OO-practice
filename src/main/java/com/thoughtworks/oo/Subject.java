package com.thoughtworks.oo;

import java.util.ArrayList;

public class Subject {
    //观察者数组
    private ArrayList<Person> observersList = new ArrayList<>();

    //增加一个观察者
    public void addObserver(Person observer) {
        this.observersList.add(observer);
    }

    //删除一个观察者
    public void deleteObserver(Person observer) {
        this.observersList.remove(observer);
    }

    //通知所有观察者
    public void notifyObserver() {
      for(Person observer : this.observersList) {
       observer.introduceUpdate();
      }
    }
}
