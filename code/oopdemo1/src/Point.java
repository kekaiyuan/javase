/**
 * @author 柯凯元
 * @create 2021/5/31 19:33
 */
/*
 * 小程序，定义一个关于点的类。
 * */
public class Point {
    int x;
    int y;

    //设置二维的坐标点
    public void set(int xx,int yy){
        x = xx;
        y = yy;
    }

    //计算两点间的距离
    public double calcDistance(Point p){

        return Math.sqrt((p.x-x)*(p.x-x)+(p.y-y)*(p.y-y));
    }

    //交换两点的坐标值
    public void changePoint(Point p){
        int a = p.x;
        p.x = x;
        x = a;
        int b = p.y;
        p.y = y;
        y = b;
    }

    public void show(){

        System.out.println("["+x+","+y+"]");
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.set(3,5);
        Point p2 = new Point();
        p2.set(2,4);
        System.out.println(p1.calcDistance(p2));
        p1.changePoint(p2);
        p1.show();
        p2.show();

    }
}
