package com.example.SpringJDBC;

import org.springframework.stereotype.Component;

@Component
public class Student {

    int stid;

    String name;

    int age;


    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stid=" + stid +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
