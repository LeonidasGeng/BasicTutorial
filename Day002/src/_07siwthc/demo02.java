package _07siwthc;

import java.util.Scanner;

//当case中的语句执行完毕,没有break时,程序会无条件执行后面的case或者default中的语句
//直到遇到break语句或者整个switch语句结束为止
public class demo02 {
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
            case 2:
                System.out.println("正常");
            default:
                System.out.println("土豪,请跟我做朋友");
                break;

        }
    }
}
