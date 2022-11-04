package _02StringMethods;
/*
字符串对象常用的方法
    charAt(int index) 指定字符串的索引，返回指定的字符
    length() 返回字符串的字符个数的长度
 */
public class demo01 {
    public static void main(String[] args) {
        String str = "abcdefg";
        //只当字符串的索引值，返回指定字符
        char c =str.charAt(2);
        System.out.println("索引值为2的字符为："+c);
        int length = str.length();
        System.out.println("字符个数是: "+length);
        
        //遍历该字符串的每一个字符
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            
        }
    }
}
