package com.kky.server;

import com.kky.client.User;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 柯凯元
 * @create 2021/6/9 3:25
 */
public class LoginThread implements Runnable{

    private Socket socket;

    public LoginThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        ObjectInputStream objectInputStream = null;
        DataOutputStream dataoutputStream = null;
        try {
            objectInputStream = new ObjectInputStream(socket.getInputStream());
            dataoutputStream = new DataOutputStream(socket.getOutputStream());
            while(true){
                User user = (User) objectInputStream.readObject();
                if (user.getUsername().equals("kky") && user.getPassword().equals("kky")) {
                    dataoutputStream.writeBoolean(true);
                    break;
                }else{
                    dataoutputStream.writeBoolean(false);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                dataoutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
