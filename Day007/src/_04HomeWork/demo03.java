package _04HomeWork;

import java.util.Scanner;

/*
键盘录入一个字符串，然后把字符串反转然后再储存到一个字符数组中，最后遍历数组字符
 */
public class demo03 {
    public static void main(String[] args) {
        //1,提示用户输入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输出一串字符: ");
        String line = sc.next(); ///adc
        //2,创建一个字符数组
        char[] arr= new char[line.length()];
        //3,逆序!逆序！逆序！遍历字符串，把字符串储存到字符数组中

        int index = 0;
        for (int i = arr.length-1; i >= 0; i--) {   ///abc
            arr[i]=line.charAt(i);
            index++;
        }
        //4,遍历字符数组的内容
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
