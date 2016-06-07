package com.github.socketstst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Stas on 07.06.2016.
 */
public class SocketServer  {
    ServerSocket server = new ServerSocket(8534);
    BufferedReader read;
    PrintWriter write;
    Socket socket;
    String text;
       public SocketServer() throws IOException {
        while (true){
           go();
        }
    }

    public void go() throws IOException {
        try {
            socket = server.accept();
            read = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            text=read.readLine();
            System.out.print("Text recieved from client: "+text+"\r\n");
            write = new PrintWriter(socket.getOutputStream());
            write.print("Work it!!!");
            write.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            read.close();
            socket.close();
        }
    }
}
