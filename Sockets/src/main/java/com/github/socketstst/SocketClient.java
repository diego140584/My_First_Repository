package com.github.socketstst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Stas on 07.06.2016.
 */
public class SocketClient implements Runnable {

    Socket client = new Socket("127.0.0.1",8434);
    PrintWriter write;

    public SocketClient() throws IOException {
        new Thread(this).start();
    }

    public void run() {
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(client.getInputStream()));
//             write =new PrintWriter(client.getOutputStream());
//            write.print("Send to server by client\r\n");
//            write.flush();
            String text = bf.readLine();
            System.out.println("Send by server: "+text);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            write.close();
            try {
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
