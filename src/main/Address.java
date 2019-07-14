package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.rmi.UnknownHostException;

public class Address {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a website name/computer name ");
        try
        {
            String name=br.readLine();
            InetAddress ip=InetAddress.getByName(name);
            System.out.println("The ip Address is"+ip);
        }
        catch(UnknownHostException e)
        {
            System.out.println("Website is not found");
        }
    }
}
