package com.kky.client;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author 柯凯元
 * @create 2021/6/9 2:23
 */
/**
 * 通过socket上传图片
 */
public class PictureClient {

    public static void main(String[] args) throws Exception {
        //创建图片输入流对象
        FileInputStream fileInputStream = new FileInputStream("1.jpg");
        //创建Socket
        Socket client = new Socket("127.0.0.1", 10109);
        //获取输出流对象
        OutputStream outputStream = client.getOutputStream();

        //读取图片并输出
        byte[] buffer = new byte[1024];
        int length = 0;
        while ((length = fileInputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, length);
        }
        //禁用输出流，否则服务端会被read方法阻塞
        client.shutdownOutput();

        //接收服务端的响应
        InputStream inputStream = client.getInputStream();
        byte[] msg = new byte[1024];
        int length2 = inputStream.read(msg);
        System.out.println(new String(msg, 0, length2));

        //关闭对象
        inputStream.close();
        outputStream.close();
        client.close();
        fileInputStream.close();
    }

}
