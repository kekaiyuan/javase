package com.kky.client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author 柯凯元
 * @create 2021/6/9 19:56
 */
public class UDPClient {

    public static void main(String[] args) throws Exception {
        //创建udp通信的socket
        DatagramSocket datagramSocket = new DatagramSocket(15000);
        //从控制台读取数据
        System.out.println("请输入数据：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //创建数据包对象
        DatagramPacket datagramPacket = new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("localhost"), 15001);
        //发送数据包
        datagramSocket.send(datagramPacket);

        datagramSocket.close();
    }

}
