package _02Opreation;

import java.util.Random;

/*
有以下数组：int[] arr = new int[5];
随机产生5个1-100的整数,储存到数组中
打印每个值
 */
public class demo06 {
    public static void main(String[] args) {
        //1,定义一个数组,长度为5
        int[] arr=new int[5];
        //2,随机产生5个随机数
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int rn = r.nextInt(100)+1;
            arr[i]=rn;
        }
        //3,并且存储到数组中
        System.out.print("这5个数分别是: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
