package com.kky;

import jdk.swing.interop.SwingInterOpUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 柯凯元
 * @create 2021/6/8 21:53
 */
public class InetAddressDemo {

    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);
            InetAddress inetAddress = InetAddress.getByName("DESKTOP-JPQVL2R");
            System.out.println(inetAddress);
            System.out.println(inetAddress.getHostName());
            System.out.println(inetAddress.getHostAddress());
            System.out.println(InetAddress.getByName("www.baidu.com"));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

}
