package com.exam;

public class MainClass {
    public static void main(String[] args) {
        //String str = "JAVA";
        String str = new String("JAVA");
        System.out.println("str : " + str);
        str = str + "_8";
        System.out.println("str : " + str);

        //StringBuffer
        StringBuffer sf = new StringBuffer("JAVA");
        System.out.println("sf : " + sf);
        sf.append("world");
        System.out.println("sf : " + sf);
        System.out.println("sf.length : " + sf.length());

    }
}
