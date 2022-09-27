public class SpecialCharacters {
    public static void main(String[] args) {
        //目标：
        //特殊的字符
        // \t 制表符

        //表示大小可变的，会根据前面的数据去补空格
        //最少补一个，最多补8个
        //会对前面的内容进行补齐
        //让补完之后的长度是8或者8的倍数

        System.out.println("abc" + "\t" + "123");
        System.out.println("name" + "age");
        System.out.println("Tom" + "22");
        System.out.println("name" + "\t" + "age");
        System.out.println("Tom" + "\t" + "22");
    }
}
