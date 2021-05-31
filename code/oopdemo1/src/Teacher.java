/**
 * @author 柯凯元
 * @create 2021/5/31 19:28
 */
/*
 * 创建类的构造方法以及方法的重载
 * */
public class Teacher {

    String name;
    int age;

    public Teacher(){

    }

    public Teacher(String xname){
        System.out.println("one argument");
        name = xname;
    }

    //构造方法
    public Teacher(String xname,int xage){
        System.out.println("two argument");
        System.out.println("new......");
        name = xname;
        age =xage;
    }

    public void teach(String a,int b){

    }

    //方法重载
    public void teach(int b,String a ){

        System.out.println("上课");
    }

    public static void main(String[] args) {
        Teacher teach = new Teacher();
        teach.name="连";
        teach.age=18;
        System.out.println(teach.name);
        System.out.println(teach.age);
        Teacher teacher2 = new Teacher("lisi",29);
        System.out.println(teacher2.name);
        System.out.println(teacher2.age);
        Teacher t3 = new Teacher("wangwu");
        System.out.println(t3.name);
    }
}
