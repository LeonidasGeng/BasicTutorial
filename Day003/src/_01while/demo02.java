package _01while;
/*
用while输出1-100的总和
分析:
1,定义变量来记录循环次数
这次是1-100,变量值就从1开始,100结束,int i =1;

2,循环的条件
i <100 (1~99)
1 <=100(1~100)

3,定义一个变量,保存每次循环i的值,累加每次i的值

 */

public class demo02 {

    public static void main(String[] args) {
        //1,这次是1-100,变量值就从1开始,100结束,int i =1;
        int i = 1;
        //2,循环条件 i <=100;
        int sum = 0;
        //3,定义一个变量来保存每次循环的i的值相加,就是累加每次i的值
        while(i<=100) {
            sum += i;
            i++;
        }
        System.out.println("1~100的总和为：" + sum);
    }
}
