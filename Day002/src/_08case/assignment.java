package _08case;

import java.util.Scanner;

/*
输入3个数字,比较大小,输出最大的那个数
 */
public class assignment {
    public static void main(String[] args) {
        //1,输入三个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字: ");
        int num1= sc.nextInt();
        System.out.println("请输入第二个数字: ");
        int num2= sc.nextInt();
        System.out.println("请输入第三个数字: ");
        int num3= sc.nextInt();

        //2,比较大小
        if(num1>num2 && num1>num3){
            System.out.println("最大的数字是： "+ num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("最大的数字是： "+ num2);
        }else if(num3>num1 && num3>num2){
            System.out.println("最大的数字是： "+ num3);
        }else if(num1==num2 && num1==num3){
            System.out.println("最大的数字是： "+ num3);
        }

    }
}
