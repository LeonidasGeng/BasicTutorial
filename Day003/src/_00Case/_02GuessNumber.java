package _00Case;

import java.util.Random;
import java.util.Scanner;

/*
 程序自动生成一个1-10之间的数字，使用程序实现猜出这个数字是多少？ 根据不同情况给出相应的提示

-   如果猜的数字比真实数字大，提示你猜的数据大了

-   如果猜的数字比真实数字小，提示你猜的数据小了

-   如果猜的数字与真实数字相等，提示恭喜你猜中了

-   只能猜3次

-   猜对了马上结束
 */
public class _02GuessNumber {
    public static void main(String[] args) {
        //1,随机产生1个数字
        Random rn = new Random();
        int r = rn.nextInt(10)+1;
        System.out.println(r);

        Scanner sc = new Scanner(System.in);

        //3,对比猜的数字和随机数
        for (int i = 0; i < 3; i++) {
            //2,提示用户输入数字
            System.out.println("请输入本次你猜的数字(1~10): ");
            int gs = sc.nextInt();//用户猜的数字
        if(gs > r){
            System.out.println("你猜的数字大啦！");
        }else if(gs < r){
            System.out.println("你猜的数字小啦！");
        }else {
            //猜对了需要结束整个循环
            System.out.println("恭喜你猜对了！程序结束！");
            break;
        }
        }
    }
}
