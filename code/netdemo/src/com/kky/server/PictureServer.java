package com.kky.server;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 柯凯元
 * @create 2021/6/9 2:24
 */
/**
 * 通过socket接收图片
 */
public class PictureServer {

    public static void main(String[] args) throws Exception {
        //创建服务端对象，开放端口
        ServerSocket serverSocket = new ServerSocket(10109);
        //创建服务端的socket
        Socket server = serverSocket.accept();
        //获取输入流对象
        InputStream inputStream = server.getInputStream();
        //创建图片输出流对象
        FileOutputStream fileOutputStream = new FileOutputStream("2.jpg");

        //读取图片并写入本地文件
        byte[] buffer = new byte[1024];
        int length = 0;
        while ((length = inputStream.read(buffer)) != -1) {
            fileOutputStream.write(buffer, 0, length);
        }

        //上传图片结束给予客户端响应
        OutputStream outputStream = server.getOutputStream();
        outputStream.write("上传成功".getBytes());

        //关闭对象
        outputStream.close();
        fileOutputStream.close();
        inputStream.close();
        server.close();
        serverSocket.close();
    }

}
