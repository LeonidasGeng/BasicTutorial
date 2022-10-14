package _00Case;

import java.util.Random;

/*

随机产生1~7的一个数字，输出每个数字对应的成语.

​    如下:

​     1:一帆风顺

​     2:二话不说

​     3:三心二意

​     4:四面楚歌

​     5:五湖四海

​     6:六亲不认

​     7:七上八下

 */
public class _03words {
    public static void main(String[] args) {
        //创建随机数
        Random rn = new Random();
        int r = rn.nextInt(6)+1;

        switch(r){
            case 1:
                System.out.println("一帆风顺");
                break;
            case 2:
                System.out.println("二话不说");
                break;
            case 3:
                System.out.println("三心二意");
                break;
            case 4:
                System.out.println("四面楚歌");
                break;
            case 5:
                System.out.println("五湖四海");
                break;
            case 6:
                System.out.println("六亲不认");
                break;
            case 7:
                System.out.println("七上八下");
        }


        //输出每个数字对应的成语
    }
}
