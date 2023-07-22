package com.extend1;

public class FirstChildClass extends ParentClass{
    public FirstChildClass(){
        System.out.println("FirstChildClass constructor");
    }

    @Override
    public void makeJJ() {
        System.out.println("--First more make--");
    }
}
