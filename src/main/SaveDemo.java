package main;

import java.io.*;
public class SaveDemo {
    public static void main(String[] args) throws IOException {
        Student s1=new Student(100,"Rajat");
        FileOutputStream fout=new FileOutputStream("f.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        try {
            out.writeObject(s1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Serializable is done successfully");
    }
}
