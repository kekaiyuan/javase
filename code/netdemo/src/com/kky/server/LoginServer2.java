package com.kky.server;

import com.kky.client.User;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 柯凯元
 * @create 2021/6/9 3:25
 */
/**
 * 实现循环登录，通过线程实现一个服务器对多个客户端
 */
public class LoginServer2 {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(14001);
        while(true){
            Socket socket = serverSocket.accept();
            LoginThread loginThread = new LoginThread(socket);
            new Thread(loginThread).start();
        }
    }

}
