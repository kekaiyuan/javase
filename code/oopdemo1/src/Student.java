/**
 * @author 柯凯元
 * @create 2021/5/31 17:35
 */

/*
 * 类的创建及使用
 * */
public class Student {

    //属性的定义，可以设置初值，可以不设置初值，无初值时会根据数据类型设置默认值
    int stuNumber;
    String name;
    int age = 20;

    //方法的定义
    //无参
    void study(){

        System.out.println("我正在学习");
    }

    //有参
    void eat(String food){

        System.out.println("我在吃"+food);
    }

    public static void main(String[] args) {
        //创建对象
        Student student = new Student();
        //使用属性
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.stuNumber);
        //修改属性值，给属性赋值
        student.name="张三";
        student.age=40;
        student.stuNumber=20190818;
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.stuNumber);
        //调用方法
        student.study();
        student.eat("apple");

    }
}
