package _02calculation;
/*
    1,如果 + 用于数值运算的时候,是加法功能
    2,如果 + 用于字符相加,其实使用自愈在计算机底层的一个数字进行相加
    3,如果 + 用于字符串进行使用,+ 就会成为一个拼接符号,任何数据与字符串使用+,结果字符串类型
 */
public class demo03 {
    public static void main(String[] args) {
        //加法功能
        int a =1, b=2;
        System.out.println(a + b);

        //用于字符串相加,其实是用字符串在计算机底层的一个数字相加,结果是int
        char c ='a';
        int d = a + c;//必须是int
        System.out.println(d);

        //拼接符
        String str1 = "Geng ";
        String str2 = "Li ";
        int num1 = 1012;
        String all = str1 + str2 + num1;//必须是String
        System.out.println(all);
        System.out.println("Hello World " + 3 + 3 + 3);//Hello World 333
        System.out.println(3 + 3 + 3 + "Hello World ");//9Hello World
    }
}
