package _07randomNumber;
/*
1, 导包;
        import java.util.Random
        idea可以帮我们自动导包
 */
import java.util.Random;

/*
随机数的写法是固定的，作用: 随机产生一个数字

写法:
    1, 导包;
        import java.util.Random
        idea可以帮我们自动导包
    2, 创建随机数对象
        只有变量名可以改变
        Random 变量名 = new Random();
    3, 产生一个随机数
        变量名.nextInt(范围值)
 */
public class demo01 {
    public static void main(String[] args) {
        /*
        2, 创建随机数对象
        只有变量名可以改变
        Random 变量名 = new Random();
         */
        Random  r = new Random();
        /*
        3, 产生一个随机数
        变量名.nextInt(范围值)
         */
        int num = r.nextInt(10);//产生的随机数的范围是0~9；
        System.out.println("随机数是： "+ num);
    }
}
