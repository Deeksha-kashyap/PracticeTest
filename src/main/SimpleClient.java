package main;

import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args)throws Exception
    {
       Socket client=new Socket("localhost",5432);
    }
}
