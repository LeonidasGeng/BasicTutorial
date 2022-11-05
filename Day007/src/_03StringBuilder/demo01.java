package _03StringBuilder;
/*
StringBuilder是一个可变的字符串，是一个字符的容器

StringBuilder构造方法：
    1,public StringBuilder() 创建一个空白的字符串
    2,public StringBuilder(String str) 根据字符串的内容，来创建可变的字符串对象

如果一个字符串经常需要发生修改，建议使用StringBuilder，而不是使用String，String每修改一次就会有一个新的对象object。而StringBuilder修改多次还是同一个对象

StringBuilder常见的方法
public StringBuilder append(任意类型) 添加数据并返回对象本身
public StringBuilder reverse() 返回相反的字符序列
public int length() 返回长度
public String toString() 把StringBuilder转换为String类型，并获取StringBuilder的字符串内容
 */
public class demo01 {
    public static void main(String[] args) {
        //1,创建一个空白的字符串
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println(sb2);

        StringBuilder strBui = new StringBuilder("Hello");
        //添加内容
        strBui.append(" 123");
        //反转字符串
        strBui.reverse();
        //返回字符个数
        strBui.length();
        int length = strBui.length();;
        String content1 = strBui.toString();
        System.out.println(content1);
        System.out.println("字符个数是："+length);


        //练习:
        //比较String与StringBuilder内容是否一致
        String strPra1 = "Ligeng";
        StringBuilder strPra2 = new StringBuilder("Ligeng");
        String strPra3 = strPra2.toString();
        boolean yesOrNo = strPra1.equals(strPra3);
        System.out.println("strPra1和strPra2内容一致吗？"+yesOrNo);

     }
}
