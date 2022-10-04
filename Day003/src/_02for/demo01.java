package _02for;
/*
for 循环的语句作用：重复执行一段代码

格式：


    for(定义变量语句;循环条件判断语句;循环条件的控制语句；){
        循环体能容/语句；
    }

for循环的执行流程:

 */
public class demo01 {
    public static void main(String[] args) {
        //1,声明/定义i变量   2,判断循环条件   4,循环条件控制语句
        for(int i = 0;      i <10;        i ++){//  0-1-2
            //3,循环体能容
            System.out.println(i+"Niu Bi");//       1-2-3
        }
    }
}
