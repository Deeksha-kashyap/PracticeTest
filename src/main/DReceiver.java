package main;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DReceiver {
    public static void main(String[] args)throws Exception {
        DatagramSocket ds=new DatagramSocket(3000);
        byte[] buf=new byte[1024];
        DatagramPacket dp=new DatagramPacket(buf,buf.length);
        ds.receive(dp);
        String strReccv=new String(dp.getData());
        System.out.println(strReccv);
        ds.close();
    }
}
