package _01String;
/*
凡是使用java.lang包下面的内容都不需要导包，比如String类

创建字符串的两种方式:
    1,直接使用""创建
    2,new String("")创建

比较字符串内容是否一致
object1.equals(object2)
输出为true or false
 */
public class demo01 {
    public static void main(String[] args) {
        //查看类class的定义，ctrl+鼠标左键点击
        String str1="李哥";
        String str2="李哥";
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        //修改字符串

        System.out.println("str1和str2是同一个对象吗？"+(str1==str2));
        System.out.println("str2和str3是同一个对象吗？"+(str2==str3));
        System.out.println("str3和str4是同一个对象吗？"+(str3==str4));

        String s1 = "abc";
        String s2 = "ab";
        String s3 = "ab"+"c";
        String s4 = s2+"c";
        System.out.println("s1和s2是同一个对象吗？"+(s1==s2));
        System.out.println("s1和s3是同一个对象吗？"+(s1==s3));
        System.out.println("s1和s4是同一个对象吗？"+(s1==s4));

        String st1 = "Hello";
        String st2 = new String("Hello");
        System.out.println("st1和st2是同一个对象吗？"+(st1==st2));

        //比较内容，值是否相等
        String stri1="李哥";
        String stri2="李哥";
        String stri3 = new String("李哥");
        //比较的是两个变量储存内存的地址是否一样
        System.out.println("stri1和stri2内存地址一样吗？"+(stri1==stri2));
        System.out.println("stri1和stri3内存地址一样吗？"+(stri1==stri2));
        //比较两个字符串中的内容是否一致，使用equals
        System.out.println("stri1和stri2字符串内容一样吗？"+(stri1.equals(stri2)));
        System.out.println("stri1和stri3字符串内容一样吗？"+(stri1.equals(stri3)));


        }

    }

