package _01String.practice1;

import java.util.Scanner;

/*
需求：
    一直用户名和密码，请示程序实现模拟用户登录
    总共给三次机会，登录之后，给出相应的提示
 */
public class practice {
    public static void main(String[] args) {
        //1，已知用户名和密码，定义两个字符串表示
        String userName = "ligeng";
        String password = "123";
        //2，键盘录入要登陆的用户名和密码，用Scanner实现，3次
        Scanner sc = new Scanner(System.in);
        //定义一个变量做登陆成功的标记
        boolean flag = false; //false代表登录失败，true代表登陆成功
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名:");
            String inputName=sc.next();
            System.out.println("请输入密码:");
            String inputPwd=sc.next();
            //3，进行比较，用equals()方法实现
            if(userName.equals(inputName) && password.equals(inputPwd)){
                System.out.println("登录成功");
                flag = true;
                break;
            }else {
                System.out.println("用户名或密码错误，请重新输入");
            }
        }

        //超过三次没有登陆成功，显示"登陆失败"
        if(flag==false){
            System.out.println("登录失败");
        }

    }

}
