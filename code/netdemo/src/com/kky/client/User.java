package com.kky.client;

import java.io.Serializable;

/**
 * @author 柯凯元
 * @create 2021/6/9 3:05
 */
public class User implements Serializable {

    private static final long serialVersionUID = 8272291057376817739L;

    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
