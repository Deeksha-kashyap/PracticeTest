package main;

import java.net.DatagramSocket;
import java.net.InetAddress;

public class DSender {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds=new DatagramSocket();
        String str="India is a good Country";
        InetAddress ia=InetAddress.getByName("localhost");
    }
}
