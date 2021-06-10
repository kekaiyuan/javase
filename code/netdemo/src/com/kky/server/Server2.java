package com.kky.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.InvalidPropertiesFormatException;

/**
 * @author 柯凯元
 * @create 2021/6/8 23:13
 */
/**
 * 客户端和服务器相互通信
 */
public class Server2 {

    public static void main(String[] args) throws IOException {
        //创建ServerSocket对象
        ServerSocket serverSocket = new ServerSocket(10020);
        //获取服务器的套接字对象
        Socket server = serverSocket.accept();
        //---------------接收客户端的输入-------------
        //获取输入流对象
        InputStream inputStream = server.getInputStream();
        byte[] buffer = new byte[1024];
        int length = inputStream.read(buffer);
        System.out.println("客户端的发送数据是：" + new String(buffer, 0, length));

        //---------------返回客户端数据---------------
        OutputStream outputStream = server.getOutputStream();
        outputStream.write("你好客户端，我是服务器".getBytes());

        outputStream.close();
        inputStream.close();
        server.close();
        serverSocket.close();
    }

}
