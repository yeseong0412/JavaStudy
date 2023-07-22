package com.extend1;

public class SecondChildClass extends ParentClass{
    public SecondChildClass(){
        System.out.println("SecondChildClass constructor");
    }

    @Override
    public void makeJJ() {
        System.out.println("--Second more make--");
    }
}
