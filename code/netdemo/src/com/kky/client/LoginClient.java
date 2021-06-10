package com.kky.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 柯凯元
 * @create 2021/6/9 3:21
 */
/**
 * 用循环实现的登录功能
 */
public class LoginClient {

    public static void main(String[] args) throws Exception {
        //创建相关对象
        Socket client = new Socket("127.0.0.1", 13014);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(client.getOutputStream());
        DataInputStream dataInputStream = new DataInputStream(client.getInputStream());

        while (true) {
            //创建User对象
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String username = sc.nextLine();
            System.out.println("请输入密码：");
            String password = sc.nextLine();
            User user = new User(username, password);

            //传输User对象
            objectOutputStream.writeObject(user);

            //获取服务端的返回值
            Boolean result = dataInputStream.readBoolean();
            if (result) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("用户名或密码不正确");
            }
        }

        //关闭对象
        objectOutputStream.close();
        dataInputStream.close();
        client.close();

    }

}
