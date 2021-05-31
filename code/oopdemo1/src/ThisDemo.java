/**
 * @author 柯凯元
 * @create 2021/5/31 19:53
 */
/*
 * this指针的使用
 * */
public class ThisDemo {

    String name;
    int age;

    public ThisDemo(){

    }

    public ThisDemo(String name){
        System.out.println("one");
        this.name = name;
    }

    //构造方法中调用其他构造方法
    public ThisDemo(String name,int age){
        this(name);
        System.out.println("two");
        this.age = age;

    }

    public void test1(){
        System.out.println("test1");
        this.test2("hehe");
    }
    public void test2(String name){
        System.out.println("test2");
        test1();
        System.out.println(name);
        System.out.println(this.name);
    }


    public static void main(String[] args) {
        ThisDemo td = new ThisDemo("zhangsan",12);
        System.out.println(td.name);
        System.out.println(td.age);
        td.test2("lisi");
    }

}

