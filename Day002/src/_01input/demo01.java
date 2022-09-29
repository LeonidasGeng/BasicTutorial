package _01input;
//1, 导入包
import java.sql.SQLOutput;
import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        //2, 创建对象
        Scanner sc = new Scanner(System.in);
        //3, 通知用户输出信息
        System.out.println("Please input your number: ");
        int myNum = sc.nextInt();//把用户输入的数据赋值给指定的变量
        System.out.println("Your number is " + myNum);
    }
}
