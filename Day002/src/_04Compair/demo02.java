package _04Compair;

import java.util.Scanner;

/*
需求：通知用户输入QQ号和密码，然后进行对比，查看结果
目前对比，别使用字符串，用==
字符串比较是否相等有其他方法，不是==
 */
public class demo02 {
    public static void main(String[] args) {
        //1，提示用户输入用户名和密码
        //定义2个变量，保存QQ号与密码
        int QQ = 425993219;
        int PW = 123456789;
        //2，让用户输入QQ号与密码
        Scanner sc = new Scanner(System.in);//创建对象
        System.out.println("请输入你的QQ号： ");
        int QQNum= sc.nextInt();
        System.out.println("请输入你的QQ密码： ");
        int QQPW= sc.nextInt();

        //3，比较QQ号与QQ密码
        System.out.println("你的QQ号正确吗？ " + (QQ==QQNum));
        System.out.println("你的QQ密码正确吗？ " + (PW==QQPW));

        /*
        逻辑运算符
            &&与/并且   ||或   !非/取反

        &&两个条件同时成立，结果才为true

        ||两个条件有一个成立，结果就为true，true/true，true/false，false/true
        */
        System.out.println(true||true);//true
        System.out.println(true||false);//true
        System.out.println(false||true);//true
        System.out.println(false||false);//false
        System.out.println("你的账号能登录吗？ " + ((PW==QQPW)&&(QQ==QQNum)));

        // !a 如果a是true，则结果为false，如果a是false，则结果为true
        System.out.println(!true); //false
        System.out.println(!false); //true
    }
}
