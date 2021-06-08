package com.kky;

import java.util.Scanner;

/**
 * @author 柯凯元
 * @create 2021/6/1 18:43
 */
/*
* 小练习，定义一个数据转换方法，参数为String类型，将参数转换成整型输出，能够捕捉NumberFormatException和Exception
* */
public class DataTypeDemo {

    public static void main(String[] args) {
        DataTypeDemo dataTypeDemo = new DataTypeDemo();
        //String str = "123";
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try{
            dataTypeDemo.typeConvert(str);
        }catch (NumberFormatException e){
            System.out.println("无法转换字符串");
        }catch (Exception e){
            System.out.println("其他错误");
        }
    }

    public static void typeConvert(String str){
        int number = Integer.parseInt(str);
        System.out.println(number);
    }

}
