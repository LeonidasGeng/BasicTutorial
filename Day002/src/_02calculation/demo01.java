package _02calculation;
/*
 +， -， *， /， %(取余数）
 */
public class demo01 {
    public static void main(String[] args) {
        //1，定义两个变量
        int a = 12;
        int b =4;

        System.out.println(a + b); //16
        System.out.println(a - b); //8
        System.out.println(a * b); //48
        System.out.println(a / b); //3
        System.out.println(a % b); //12 ➗ 4 = 3 ---0
        //判断一个数字是否为偶数
        System.out.println(12%2);
        System.out.println(7%10);
    }
}
