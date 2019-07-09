package main;

import java.io.*;
public class ReadDemo {
    public static void main(String[] args) {
        ObjectOutputStream in=new ObjectOutputStream(new FileInputStream("MyFile.txt"));
    }
}
