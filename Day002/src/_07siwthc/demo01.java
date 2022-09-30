package _07siwthc;

import java.util.Scanner;

/*
switch语句，是一个判断，控制流程的语句
格式：
switch(变量){
    case 值1：
            语句体1；//变量值等于值1的语句
            break;//结束switch语句
    case 值2：
            语句体2；//变量值等于值1的语句
            break;//结束switch语句
    ……
    default:
            语句体x;//变量值等于值x的语句
            break;//结束switch语句
}
注意:
变量必须是byte,short,int,char,String，枚举
case后面必须是个常量
break表示中断，结束
default，变量的值都不匹配，执行这个语句
 */
public class demo01 {
    public static void main(String[] args) {
        System.out.println("你家里有几辆车？");
        Scanner sc = new Scanner(System.in);
        int cars = sc.nextInt();
        switch (cars){
            case 0:
                System.out.println("穷B");
                break;
            case 1:
                System.out.println("还行");
                break;
            case 2:
                System.out.println("正常");
                break;
            default:
                System.out.println("土豪，请跟我做朋友");
                break;

        }
    }
}
