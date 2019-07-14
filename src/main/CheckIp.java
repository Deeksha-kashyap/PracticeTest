package main;

import java.net.InetAddress;

public class CheckIp {
    public static void main(String[] args) {
        try{
            InetAddress address=InetAddress.getLocalHost();
            System.out.println(address);
        }
    }
}
