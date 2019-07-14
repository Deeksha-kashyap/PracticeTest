package main;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DSender {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds=new DatagramSocket();
        String str="India is a good Country";
        InetAddress ia=InetAddress.getByName("localhost");
        byte[] barr=str.getBytes();
        DatagramPacket dp=new DatagramPacket(barr,str.length(),ia,3000);
        ds.send(dp);
        ds.close();
    }
}
