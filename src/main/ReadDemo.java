package main;

import java.io.*;
 class ReadDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("MyFile.txt"));
        Student s=(Student)in.readObject();
        System.out.println(s.id+"\t"+s.name);
        in.close();
    }
}
