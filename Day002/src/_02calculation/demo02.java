package _02calculation;

//运算时主义的细节
//1,如果整数运算,结果是整数。如果有小数参与运算,结果一定是小数
//2,byte,short,char会自动提升至int类型

public class demo02 {
    public static void main(String[] args) {
        //1
        System.out.println(9/3); //3
        System.out.println(9/4); //2, 不包含余数或者小数

        System.out.println(9/3.0); //3.0
        System.out.println(9/4.0); //2.25

        System.out.println(9/4.1); //2.195

        //2
        byte b1 = 1;
        byte b2 = 2;
        //byte b3 = b1 + b2; 错误的
        //使用inter类型保存结果
        int b3 = b1 + b2;
        System.out.println(b3);
        //使用强制类型转换
        byte b4 = (byte)(b1 + b2);
        System.out.println(b4);
        //2*3/4先计算,然后10 + 1 - 5
        System.out.println(10 + 2*3/4-5);
        System.out.println((10 + 2)*3/4-5);

    }
}
