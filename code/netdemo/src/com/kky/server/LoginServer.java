package com.kky.server;

import com.kky.client.User;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 柯凯元
 * @create 2021/6/9 3:25
 */
/**
 * 可以循环登录，服务器与客户端是一对一的模式
 */
public class LoginServer {

    public static void main(String[] args) throws Exception {
        //开启端口
        ServerSocket serverSocket = new ServerSocket(13014);

        //创建相关对象
        Socket server = serverSocket.accept();
        ObjectInputStream objectInputStream = new ObjectInputStream(server.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(server.getOutputStream());

        while (true) {
            //获取User对象
            User user = (User) objectInputStream.readObject();
            //进行判断并返回对应结果
            if (user.getUsername().equals("kky") && user.getPassword().equals("kky")) {
                dataOutputStream.write(1);
                break;
            } else {
                dataOutputStream.write(0);
            }
        }

        //关闭对象
        dataOutputStream.close();
        server.close();
        serverSocket.close();
    }

}
