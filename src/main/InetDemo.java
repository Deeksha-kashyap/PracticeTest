package main;

import java.net.InetAddress;

public class InetDemo {
    public static void main(String[] args) {
        try
        {
            InetAddress ip=InetAddress.getByName("www.github.com");
            System.out.println("Host Name: "+ip.getHostName());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
