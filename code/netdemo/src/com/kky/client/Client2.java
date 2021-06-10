package com.kky.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author 柯凯元
 * @create 2021/6/8 22:32
 */
/**
 * 客户端和服务器相互通信
 */
public class Client2 {

    public static void main(String[] args) throws IOException {

        //创建客户端对象
        Socket client = new Socket("127.0.0.1", 10020);
        //-----------------向外进行输出--------------------
        //获取输出流对象
        OutputStream outputStream = client.getOutputStream();
        //数据输出
        outputStream.write("你好服务器，我是客户端".getBytes());

        //-----------------接收服务端传回的消息--------------------
        InputStream inputStream = client.getInputStream();
        byte[] buffer = new byte[1024];
        int length = inputStream.read(buffer);
        System.out.println("服务端的响应数据是：" + new String(buffer, 0, length));

        inputStream.close();
        outputStream.close();
        client.close();

    }

}
