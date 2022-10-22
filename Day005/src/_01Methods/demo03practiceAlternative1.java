package _01Methods;
/*
打印两个广告，一个循环3次，一个循环2次

 */
public class demo03practiceAlternative1 {
    public static void main(String[] args) {
        HW();
        AP();
    }

    public static void HW(){
        for (int i = 0; i < 3; i++) {
            System.out.println("华为手机就是牛！");
        }

    }
    public static void AP(){
        for (int i = 0; i < 2; i++) {
            System.out.println("Apple拐了");
        }

    }
}
