package _01Methods;
/*
打印两个广告,一个循环3次,一个循环2次

 */
public class demo03practice {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            HW();
        }
        for (int i = 0; i < 2; i++) {
            AP();
        }
    }
    public static void HW(){
        System.out.println("华为手机就是牛！");
    }
    public static void AP(){
        System.out.println("Apple拐了");
    }
}
