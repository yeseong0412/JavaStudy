package com.exam;

public class MainClass {
    public static void main(String[] args) {
        Student stu = new Student("양예성", 100);
        stu.getInfo();

        stu.setScore(60);
        stu.getInfo();
    }
}
