package _03Case;

import java.util.Scanner;

/*
输入10个同学的成绩，输出他们的最高分，最低分，平均成绩
减少遍历次数，减少代码编写
 */
public class _02Case1ez {
    public static void main(String[] args) {
        //1,定义一个数组，长度为10，为同学的成绩
        int[] arr = new int[10];
        //2,输入每个学生的成绩
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入第"+(i+1)+"同学的成绩");
            //录入学生的成绩储存到num这个变量中
            int num =sc.nextInt();
            arr[i]=num;
        }
        //3,求平均成绩
        //累加所有人的成绩
        int sum = 0;
        //3,最高分，最大值
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
        }
        //平均成绩
        System.out.println("这些人的平均成绩为："+(sum/arr.length));
        System.out.println("这些人的最高分为："+max);
        System.out.println("这些人的最低分为："+min);


    }
}
