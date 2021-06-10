package com.kky.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 柯凯元
 * @create 2021/6/8 22:40
 */
/**
 * 接收客户端的数据
 */
public class Server {

    public static void main(String[] args) throws IOException{
        //服务端需要使用ServerSocket来开放本地的端口
        ServerSocket serverSocket = new ServerSocket(10086);
        //接收client传输过来的数据，需要定义socket对象
        Socket server = serverSocket.accept();
        //通过server获取输入流对象
        InputStream inputStream = server.getInputStream();
        //对输入流做包装
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String str = dataInputStream.readUTF();
        System.out.println(str);

        dataInputStream.close();
        inputStream.close();
        server.close();
        serverSocket.close();
    }

}
