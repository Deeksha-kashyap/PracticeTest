package main;

import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) {
        ServerSocket server=new ServerSocket(5432);
        System.out.println("Server is Ready wait for client");
        Socket clientSocket=server.accept();
    }
}
