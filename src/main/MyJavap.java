package main;


import java.lang.reflect.*;

public class MyJavap {
    public static void main(String[] args) throws Exception {
        Class c=Class.forName(args[0]);
        System.out.println("Fields........");
        Field f[]=c.getDeclaredFields();
    }
}
