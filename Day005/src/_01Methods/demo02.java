package _01Methods;
/*
方法
某一件事的固定流程
把一段功能代码独立封装到一个代码块中，然后给这个代码块起一个名字，以后如果需要使用这个功能，使用这段代码，直接使用名字即可调用

每10分钟弹出3条广告

弊端：
代码冗余，代码大量重复，复用性低

解决问题的办法：使用“方法”，把打广告的代码，独立封装成一个方法，即可重复使用/调用

优化：printAd

定义方法：
定义在类class里面，方法method之外
JVM在启动的时候只负责执行了main方法，在其它方法的代码如果需要执行，需要在main方法中调用

调用方法的格式：方法名+()


 */
public class demo02 {
    public static void main(String[] args) {
        printAd();
        System.out.println("=====过了10分钟=====");
        printAd();
        System.out.println("=====过了10分钟=====");
        //调用方法
        printAd();


    }
    //方法,method.起名字：printAd
    //之后用这个方法，就直接用名字(printAD)
    public static void printAd(){ //方法名的写法： 小驼峰，首单词小写，之后的单词大写，加()
        //代码作用，打广告
        for (int i = 0; i < 3; i++) {
            System.out.println("LGNB");
        }
    }
}
