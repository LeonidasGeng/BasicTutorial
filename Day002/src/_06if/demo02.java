package _06if;
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

import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
        //输入小明考试分数
        System.out.println("请输入小明的考试分数：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        //判断小明解决
        if(score >=95 && score<=100){
            System.out.println("奖励自行车一辆");
        }else if(score >= 90 && score <= 94){
            System.out.println("奖励游乐园门票一张");
        }else if(score >= 80 && score <= 90){
            System.out.println("奖励游乐园门票一张");
        }else{
            System.out.println("胖揍一顿");
        }
    }
}
