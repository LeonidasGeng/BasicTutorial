package _03StringBuilder.practice;

import java.util.Scanner;

/*
需求：
录入一串字符，判断是否为对称字符，输出“是”或“不是”
对称字符：123321，111222，12321
非对称字符：123456
 */
public class demo01 {
    public static void main(String[] args) {
        //1,输入一个字符串，Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String input = sc.next();
        //2,将字符串转换成StringBuilder类型
        StringBuilder sb = new StringBuilder(input);
        //3,对stringBuilder进行反转，并转化为字符串类型
        sb.reverse();
        String inputRev = sb.toString();
        //4,对比
        if(input.equals(inputRev)){
            System.out.println("输入的内容是对称的");
        }else {
            System.out.println("输入的内容是非对称的");
        }
    }
}
