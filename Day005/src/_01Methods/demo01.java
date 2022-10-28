package _01Methods;
/*
方法
某一件事的固定流程

每10分钟弹出3条广告

弊端：
代码冗余,代码大量重复,复用性低

解决问题的办法：使用“方法",把打广告的代码,独立封装成一个方法,即可重复使用,调用

优化：

 */
public class demo01 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("LGNB");

        }
        System.out.println("=====过了10分钟=====");
        for (int i = 0; i < 3; i++) {
            System.out.println("LGNB");

        }
        System.out.println("=====过了10分钟=====");
        for (int i = 0; i < 3; i++) {
            System.out.println("LGNB");

        }

    }
}
