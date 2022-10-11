package _00Case;

import java.util.Scanner;

/*
需求：公司每周都要对出勤情况进行统计

具体如下:
1.定义一个变量统计上班的次数
2.使用for循环1-7的数字
3.在for循环中使用Scanner获取1或者0
   1表示有上班，0表示休假或旷工
4.使用if语句判断输入的是1还是0
5.如果输入的是1则把统计变量++
6.最终打印一周出勤了几天
  结果: 本周共出勤xx天!
 */
public class _01WeeklyWorkingRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//在循坏之外
//需求：公司每周都要对出勤情况进行统计
//具体如下:
//1.定义一个变量统计上班的次数
        int count = 0;
//2.使用for循环1-5的数字

        for (int i = 1; i <= 7; i++) {
            if(i <7){
            System.out.println("请问你周"+i+"是否上班了?");}
            else {
                System.out.println("请输入你周日是否上班了？");
            }
//3.在for循环中使用Scanner获取1或者0

            int num = sc.nextInt();

            //4.使用if语句判断输入的是1还是0
            // 1表示有上班，0表示休假或旷工
            if(num == 1){
            //5.如果输入的是1则把统计变量++
                count++;
            }

        }
            //6.最终打印一周出勤了几天
            //7.结果: 本周共出勤xx天!
        System.out.println("本周你上班的天数是："+count+"天");

    }

}
