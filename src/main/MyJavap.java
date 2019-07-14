package main;


import java.lang.reflect.*;

public class MyJavap {
    public static void main(String[] args) throws Exception {
        Class c=Class.forName(args[0]);
        System.out.println("Fields........");
        Field f[]=c.getDeclaredFields();
        for (int i = 0; i < f.length; i++)
            System.out.println(f[i]);
        System.out.println("Constructor.......");
        Constructor con[]=c.getDeclaredConstructors();
        for (int i = 0; i < con.length; i++)
            System.out.println(con[i]);



    }
}
