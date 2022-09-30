package _05Triple;

import java.util.Scanner;

/*
三元运算符
格式：
关系表达式（比较运算符）?表达式1:表达式2;
先计算关系表达式的值
true = 表达式1/前者
false = 表达式2/后者
 */
public class demo01 {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        int max = a>b?a:b;//10 >20?
        System.out.println("最大值是: " + max);

        //创建一个对象
        Scanner a1 = new Scanner(System.in);
        System.out.println("请输入第一个数： ");
        int x = a1.nextInt();
        System.out.println("请输入第一个数： ");
        int y = a1.nextInt();
        int bigger =  x > y ? x : y ;
        System.out.println("最大值是: " + bigger);

    }
}
