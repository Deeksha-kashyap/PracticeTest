package main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args)throws Exception
    {
       Socket client=new Socket("localhost",5432);
       //Socket client=new Socket(InetAddress.getLocalHost(1,5432));
        InputStream is=client.getInputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
    }
}
