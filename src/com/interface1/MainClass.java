package com.interface1;

public class MainClass {
    public static void main(String[] args) {
        InterfaceA ia = new InterfaceClass();
        InterfaceB ib = new InterfaceClass();
        ib.funB();
        ia.funA();
        ib.funB();
    }
}
