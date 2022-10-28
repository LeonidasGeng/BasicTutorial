package _02Opreation;

import java.util.Scanner;

/*
有以下数组：int[] arr = new int[5];请编程从控制台接收5名学员的年龄,并存储到数组中。
遍历数组,打印每个年龄值
 */
public class demo05 {
    public static void main(String[] args) {
        //1,定义一个的数组,长度为5
        int[] arr = new int[5];
        //2,提示用户录入5名学生的年龄,并且存储到数组中
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第"+(i+1)+"学生的年龄： ");
            int age = sc.nextInt();
            arr[i]=age;
        }
        System.out.print("他们的年龄分别是：");
        //3,遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
