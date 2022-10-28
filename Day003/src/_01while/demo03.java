package _01while;
/*
珠穆朗玛峰,8848米
一张纸的厚度0.0001
对折多少次呢？超过8848

分析:

 */
public class demo03 {
    public static void main(String[] args) {
        //1,定义变量保存纸的厚度
        double paper = 0.0001;

        //2,定义变量保存山的高度
        int mount = 8848;

        //3,定义一个变量保存纸张对折次数
        int count =0;
        //3,编写循环条件
        while(paper <= mount){
            //现在纸张厚度=原本纸张厚度 * 2
            paper = paper *2;
            count ++;
        }
        System.out.println("对折次数为： "+ count);
    }
}
