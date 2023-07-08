package com.spring.bean;

public class Teacher {
    private String name;
    private String age;

    public Teacher(){
        System.out.println("init Teacher");
    }

    public void wmi(){
        System.out.println("I am teacher: my name is "+ name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
