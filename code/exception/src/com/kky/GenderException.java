package com.kky;

/**
 * @author 柯凯元
 * @create 2021/6/3 2:20
 */
public class GenderException extends Exception {

    public GenderException(){
        System.out.println("性别异常");
    }

    public GenderException(String msg){
        System.out.println(msg);
    }
}
