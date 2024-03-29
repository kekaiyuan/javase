import java.util.Scanner;

/**
 * @author 柯凯元
 * @create 2021/5/31 19:30
 */
/*
 *  字符串在比较的时候：
 *  ==：比较的是地址
 *  equals:比较的是具体的值
 * */
public class StringDemo {

    public static void main(String[] args) {
        String str = "abc";
        String str1 = str;
        System.out.println(str == str1);
        System.out.println(str.equals(str1));

        Scanner sc = new Scanner(System.in);
        String str2 = sc.nextLine();
        System.out.println(str == str2);
        System.out.println(str.equals(str2));

        String str3 = new String("abc");
        System.out.println(str == str3);
        System.out.println(str.equals(str3));
    }
}
