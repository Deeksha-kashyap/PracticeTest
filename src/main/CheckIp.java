package main;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class CheckIp {
    public static void main(String[] args) {
        try{
            InetAddress address=InetAddress.getLocalHost();
            System.out.println(address); //to print name and ip
        }
        catch(UnknownHostException e)
        {
            System.out.println(e);
        }
    }
}
