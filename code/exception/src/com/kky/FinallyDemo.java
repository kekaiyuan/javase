package com.kky;

/**
 * @author 柯凯元
 * @create 2021/6/3 2:19
 */
/*
 * 在程序运行过程中，如果处理异常的部分包含finally的处理，那么无论代码是否发生异常，finally中的代码总会执行
 *   finally包含哪些处理逻辑？
 *       1、IO流的关闭操作一般设置在finally中
 *       2、数据库的连接关闭操作设置在finally中
 *
 * */
public class FinallyDemo {

    public static void main(String[] args) {
        test();
    }

    public static void test(){
        try{
            System.out.println(1/10);
            return;
        }catch (Exception e){
            e.printStackTrace();
            return;
        }finally {
            System.out.println("我是finally处理块");
            return;
        }
    }
}
