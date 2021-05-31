import java.util.Scanner;

/**
 * @author 柯凯元
 * @create 2021/5/31 17:51
 */

/*
 * 小练习，修改密码
 * */

public class Administrator {

    String loginName = "admin";
    String password = "123";

    public void introduce(){
        System.out.println("用户名："+loginName);
        System.out.println("密码:"+password);
    }

    public static void main(String[] args) {
        Administrator admin = new Administrator();
        admin.introduce();

        //从控制台读取数据，使用Scanner对象
        Scanner sc  = new Scanner(System.in);
        System.out.println("修改密码");
        while(true){

            System.out.printf("请输入用户名称：");
            String name = sc.nextLine();
            System.out.printf("请输入密码：");
            String pwd = sc.nextLine();
            if (name.equals(admin.loginName) && pwd.equals(admin.password)){
                System.out.printf("请输入新密码：");
                admin.password = sc.nextLine();
                System.out.println("修改成功");

                break;
            }else{
                System.out.println("用户名或密码不正确，请重新输入");
            }
        }
        admin.introduce();
    }
}
