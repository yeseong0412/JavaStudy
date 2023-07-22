package com.interface1;

public class InterfaceClass implements InterfaceA, InterfaceB {
    public InterfaceClass(){
        System.out.println(" --Interface constructor-- ");
    }
    @Override
    public void funA() {
        System.out.println(" --funA()-- ");
    }

    @Override
    public void funB() {
        System.out.println(" --funB()--");
    }
}
