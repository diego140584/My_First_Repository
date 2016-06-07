package com.github.socketstst;

import java.io.IOException;

/**
 * Created by Stas on 07.06.2016.
 */
public class MainClass {
    public static void main(String[] args) throws IOException {
        new SocketServer();
        new SocketClient();
    }
}
