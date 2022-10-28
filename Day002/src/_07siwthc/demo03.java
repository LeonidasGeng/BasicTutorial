package _07siwthc;
//输入月份,判断季节

import java.util.Scanner;

public class demo03 {
    public static void main(String[] args) {
        //1,提示用户输入月份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份");
        int month = sc.nextInt();
        switch(month){
            case 1:
            case 2:
            case 3:
                System.out.println("This is Spring");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("This is Summer");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("This is Fall");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("This is Winter");
                break;
            default:
                System.out.println("Input Error");

        }
    }
}
