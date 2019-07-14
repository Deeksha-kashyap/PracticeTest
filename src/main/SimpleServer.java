package main;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) throws Exception
    {
        ServerSocket server=new ServerSocket(5432);
        System.out.println("Server is Ready wait for client");
        Socket clientSocket=server.accept();
        System.out.println("Connection is established with the client");
        OutputStream serverOut=clientSocket.getOutputStream();
        PrintWriter pw=new PrintWriter(serverOut,true);
        pw.println("Hello Net World");
    }
}
