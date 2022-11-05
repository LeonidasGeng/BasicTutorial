package _01ArrayList;

import java.util.ArrayList;

/*
之前存储多个数据的时候使用数组去存储

数组的特点：一旦创建（初始化），长度固定
ArrayList: 没有长度限制
 */
public class demo01 {
    public static void main(String[] args) {
//        //创建一个数组
//        int[] arr = new int[3];//最多储存3个数据
//        arr[0]=1;
//        arr[1]=2;
//        arr[2]=3;
////        arr[3]=4;//会报错
        //创建一个ArrayList
        ArrayList al = new ArrayList();
        //添加元素
        al.add(1);
        al.add('A');
        al.add("Ligeng");
        al.add("00");
        al.add(00);

        System.out.println(al);

    }
}
