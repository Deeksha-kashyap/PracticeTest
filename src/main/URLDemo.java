package main;

import java.net.URL;

public class URLDemo {
    public static void main(String[] args) {
        try
        {
            URL url=new URL("https://github.com");
            System.out.println("Protocol:"+url.getProtocol());
            System.out.println("Host Name:"+url.getHost());
            System.out.println("Port Number:"+url.getPort());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
