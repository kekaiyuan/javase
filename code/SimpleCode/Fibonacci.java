import java.util.Scanner;
/*
斐波那契数列
*/
public class Fibonacci{
	
	public static void main(String[] args){
		/*通过循环求解
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要打印的斐波那契数列的个数");
		int count = sc.nextInt();
		int x = 1;
		int y = 1;
		int z = 0;
		//前两位是1
		for(int i = 1;i<=count;i++){
			if(i==1 || i==2){
				System.out.print(1+"\t");
			}else{
				z=x+y;
				x=y;
				y=z;
				System.out.print(z+"\t");
			}
		}
		*/
		
		//递归方式求解
		for(int i = 1;i<=10;i++){
			System.out.print(getNumber(i)+"\t");
		}
	}
	
	
	public static int getNumber(int number){
		if(number==1||number==2){
			return 1;
		}else{
			return getNumber(number-1)+getNumber(number-2);
		}
	}
	
}