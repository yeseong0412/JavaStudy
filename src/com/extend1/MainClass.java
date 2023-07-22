package com.extend1;

public class MainClass {
    public static void main(String[] args) {
        ParentClass pArr[] = new ParentClass[2];

        ParentClass child1 = new FirstChildClass();
        ParentClass child2 = new SecondChildClass();

        pArr[0] = child1;
        pArr[1] = child2;
    }
}
