package com.kky.server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author 柯凯元
 * @create 2021/6/9 20:11
 */
public class UDPServer {

    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(15001);
        byte[] buffer = new byte[1024];
        //用来接收传输过来的数据
        DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
        //利用创建好的数据包对象来接收数据
        datagramSocket.receive(datagramPacket);
        //打印输出信息
        System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));

        datagramSocket.close();
    }

}
