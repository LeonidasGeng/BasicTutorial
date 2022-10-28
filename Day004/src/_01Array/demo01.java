package _01Array;
/*
需求：存储每个人的考试成绩

弊端：
    1,储存大批量的数据,变量名不好取
    2,非常难做统计的工作

数组：
    一个容器,存储多个同种类型的数据容器

格式：
    格式1：(动态初始化,先定义一个数组,先造房子,再塞/存储数据/元素=塞人)
        数据类型[] 变量名 = new 数据类型[数组的长度or数组的容量]

    格式2：（静态初始化,定于与初始化同时进行）
        数据类型[] 变量名 = new 数据类型[]{元素1,元素2......};
        int[] 变量名 = {元素1,元素2......}


 */
public class demo01 {
    public static void main(String[] args) {
        //我们班有100个同学
        /*
        int score1 = 98;
        int score2 = 98;
        int score3 = 98;
        int score4 = 98;
        int score5 = 98;
        int score6 = 98;
        int score7 = 98;
        int score8 = 98;
        ......
        */

        //type1:定义一个数组长度为3,这个数组能储存3个元素,类型为int的数据
        int[] arr = new int[3];
        //往数组的里面存储数据
        arr[0] =10;
        arr[1] =11;
        arr[2] =12;

        //type2:
        int[] arr2 = {100,99,98,97,96};
    }
}
