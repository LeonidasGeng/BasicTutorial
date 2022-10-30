public class DataTypes {
    public static void main(String[] args) {
        //目标：
        //能把字面量进行打印输出

        //1,输出整数类型的字面量
        System.out.println(123);
        System.out.println(-123);

        //2,输出小数类型的字面量
        System.out.println(12.3);
        System.out.println(-12.3);
        System.out.println(10.0);

        System.out.println("============================");
        //3,输出字符串类型的字面量
        System.out.println("123");
        System.out.println(" ");
        System.out.println("");
        System.out.println("HelloWorld");

        //4,输出字符类型的字面量
        System.out.println('a');
        System.out.println('A');

        System.out.println("============================");
        //5,输出布尔类型的字面量
        System.out.println(true);
        System.out.println(false);

        System.out.println("============================");
        //6,输出空值类型的字面量
        //注意：不能直接使用,不然代码报错
        //错误：System.out.println(null);
        System.out.println("null");

    }
}
