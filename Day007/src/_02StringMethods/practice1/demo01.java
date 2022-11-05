package _02StringMethods.practice1;

import java.util.Scanner;

/*
录入一串字符，统计大写，小写，数字各有几个
 */
public class demo01 {
    public static void main(String[] args) {
        //1，录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想输入的内容(仅限于英文(大小写)和数字(阿拉伯数字)): ");
        String inputText= sc.next();
        //2，定义三个变量，统计大写，小写，数字的个数
        int Upper = 0;
        int Lower = 0;
        int Number = 0;
        //3. 遍历字符串，取出妹妹一个字符去判断是大写，小写还是数字字符，然后对应的变量+1
        for (int i = 0; i < inputText.length(); i++) {
            //取出每一个字符
            char single = inputText.charAt(i);
            //做出判断，做出统计
            if (single>='A' && single<='Z'){
                Upper++;
            } else if (single>='a' && single<='z') {
                Lower++;
            }else {
                Number++;
            }
        }
        System.out.println("该字符串为:"+inputText+"， 其中大写字符数为："+Upper+"， 小写字符数为："+Lower+"， 数字字符数为："+Number);
    }
}
