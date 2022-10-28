package _06if;

import java.util.Scanner;

/*
case1: 用户名与密码,如果都正确,输出登陆成功
格式1：
    if(关系表达式/Boolean){
        符合条件就执行的语句
    }

 */
public class demo01 {
    public static void main(String[] args) {
        int qqNum = 123456;
        int qqPwd =123;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入QQ号： ");
        int qqIpt = sc.nextInt();
        System.out.println("请输入QQ密码： ");
        int pwdIpt = sc.nextInt();
        //第一种写法
        /* boolean result = qqIpt==qqNum && qqPwd==pwdIpt;
        if(result) {
            System.out.println("登陆成功！");//只有（ ）是true才会执行
        }
         */
//        if(qqIpt==qqNum && qqPwd==pwdIpt){
//            System.out.println("登陆成功！");
//        }

        /*
        第二种写法
        格式
        if(boolean){
            语句1；boolean值为true,执行语句1
        }else{
            语句2；boolean值为true,执行语句2
        }
         */
        //如果正确,输出登陆成功,否则输出：登陆失败！
        if(qqIpt==qqNum && qqPwd==pwdIpt){
            System.out.println("登陆成功！");
        }else{
            System.out.println("登陆失败！");
        }

        /*
        第三种
        if(条件1){
            语句体1;//符合条件1执行的语句
        }else if(条件2){
            语句体2;//符合条件2执行的语句
        }else if(条件3){
            语句体3;//符合条件3执行的语句
        }
        ……
        else{
            语句体x;//当都不符合条件的时候
        }
         */


    }
}
