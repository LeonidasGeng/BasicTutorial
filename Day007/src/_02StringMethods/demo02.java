package _02StringMethods;
/*
String substring(int begin, int end)
指定开始索引值与结束索引值截取字符串，返回截取的字符串
注意：包头不包尾，相当于[xxx)=begin ~ end-1

String substring(int begin)
指定开始索引值的符串，返回之后所有的字符串

replace(原有字符串，新字符串)
替换原有的字符串

 */
public class demo02 {
    public static void main(String[] args) {

        String str = "Today I want to eat KFC";

        String newStr = str.substring(20,23);
        System.out.println("是不是KFC？" + newStr);
        System.out.println("是不是KFC？" + str.substring(20,23));

        String newStr1 = str.substring(20);
        System.out.println("是不是KFC？" + newStr1);
        System.out.println("是不是KFC？" + str.substring(20));

        String newStr2 = str.replace("KFC","McDonald's");
        System.out.println(str+"，但今天不想吃KFC想吃McDonald's: "+newStr2);
        System.out.println(str+"，但今天不想吃KFC想吃McDonald's: "+str.replace("KFC","McDonald's"));
    }
}
