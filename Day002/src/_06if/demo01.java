package _06if;

import java.util.Scanner;

/*
case1: 用户名与密码，如果都正确，输出登陆成功
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
        if(qqIpt==qqNum && qqPwd==pwdIpt){
            System.out.println("登陆成功！");
        }
    }
}
