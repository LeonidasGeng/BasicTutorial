package _04Compair;
/*
 ==等于 !=不等于 >大于 <小于 >=大于等于 <=小于等于
 结果一定是布尔类型boolean, true 条件成立,false 条件不成立
 */
public class demo01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 11;
        boolean result1 = a == b;
        boolean result2 = a == c;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println("a和b相等吗？ " + (a>b));
    }
}
